package br.com.munif.treinamento.unicesumar.voucher.negocios;

import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Aluno;

public class PoloService extends BaseService<Polo> {

	public PoloService(VicRepository<Polo> repository) {
		super(repository);
	}

}
