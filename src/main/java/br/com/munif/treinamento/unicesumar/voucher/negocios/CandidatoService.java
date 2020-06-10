package br.com.munif.treinamento.unicesumar.voucher.negocios;

import org.springframework.stereotype.Service;

import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Candidato;

@Service
public class CandidatoService extends BaseService<Candidato> {

	public CandidatoService(VicRepository<Candidato> repository) {
		super(repository);
	}

}
