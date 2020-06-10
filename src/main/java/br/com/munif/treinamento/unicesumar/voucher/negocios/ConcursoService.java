package br.com.munif.treinamento.unicesumar.voucher.negocios;

import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Aluno;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Concurso;

public class ConcursoService extends BaseService<Concurso> {

	public ConcursoService(VicRepository<Concurso> repository) {
		super(repository);
	}

}
