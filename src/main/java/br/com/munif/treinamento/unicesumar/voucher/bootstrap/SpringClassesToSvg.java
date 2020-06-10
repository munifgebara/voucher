package br.com.munif.treinamento.unicesumar.voucher.bootstrap;

import br.com.munif.framework.vicente.core.GraphUtil;
import br.com.munif.framework.vicente.core.Utils;
import br.com.munif.framework.vicente.domain.entities.EntitiesCommon;
import br.com.munif.framework.vicente.domain.entities.IEntities;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpringClassesToSvg implements IEntities {

	public static Class[] anotacoes = { Repository.class, RestController.class, Service.class };

	public static String gera() {
		try {
			String generatedDiagram = new SpringClassesToSvg().generateDiagram();

			String sh = GraphUtil.sh(new String[] { "/usr/bin/dot", "-T" + "svg" }, generatedDiagram);

			return sh;
		} catch (IOException ex) {
			Logger.getLogger(SpringClassesToSvg.class.getName()).log(Level.SEVERE, null, ex);
			return ex.toString();
		}
	}

	@SuppressWarnings("rawtypes")
	private List<Class> onlyEntities(List<Class> scanClasses) {
		List<Class> toReturn = new ArrayList<>();

		for (Class c : scanClasses) {
			for (Class anotacao : anotacoes) {
				if (c.isAnnotationPresent(anotacao)) {
					toReturn.add(c);
				}
			}
		}

		return toReturn;
	}

	@SuppressWarnings("rawtypes")
	public String generateDiagram() throws IOException {
		List<Class> onlyEntities = onlyEntities(Utils.scanClasses());
		return processClasses(onlyEntities);
	}

	@SuppressWarnings("rawtypes")
	private String processClasses(List<Class> classes) {
		StringWriter fw = new StringWriter();
		Map<String, List<Class>> packages = EntitiesCommon.searchPackages(classes);
		try {
			EntitiesCommon.writeAssociations(this, fw, packages);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return fw.toString();
	}

	@Override
	@SuppressWarnings("rawtypes")
	public List<String> createClass(Class entidade, Writer fw) throws Exception {
		List<String> associacoes = new ArrayList<String>();

		if (entidade.getSuperclass() != null && !entidade.getSuperclass().equals(Object.class)) {
			associacoes.add("edge [ arrowhead = \"empty\" headlabel = \"\" taillabel = \"\"] "
					+ entidade.getSimpleName() + " -> " + entidade.getSuperclass().getSimpleName());

		}

		return EntitiesCommon.getAssociationsFromEntity(entidade, fw, associacoes);
	}

}
