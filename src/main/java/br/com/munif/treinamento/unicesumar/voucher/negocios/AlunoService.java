package br.com.munif.treinamento.unicesumar.voucher.negocios;

import org.springframework.stereotype.Service;

import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Aluno;

@Service
public class AlunoService extends BaseService<Aluno> {

	public AlunoService(VicRepository<Aluno> repository) {
		super(repository);
	}

}
