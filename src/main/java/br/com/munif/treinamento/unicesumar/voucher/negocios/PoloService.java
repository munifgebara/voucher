package br.com.munif.treinamento.unicesumar.voucher.negocios;

import org.springframework.stereotype.Service;

import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Polo;

@Service
public class PoloService extends BaseService<Polo> {

	public PoloService(VicRepository<Polo> repository) {
		super(repository);
	}

}
