package br.com.munif.treinamento.unicesumar.voucher.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.munif.framework.vicente.api.BaseAPI;
import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Concurso;

@RestController
@RequestMapping("/api/concursos")
public class ConcursoApi extends BaseAPI<Concurso> {

	private static final String ENTITY_NAME = "concurso";

	public ConcursoApi(BaseService<Concurso> service) {
		super(service);
	}
}