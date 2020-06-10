package br.com.munif.treinamento.unicesumar.voucher.negocios;

import org.springframework.stereotype.Service;

import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.CampanhaVoucher;

@Service
public class CampanhaVoucherService extends BaseService<CampanhaVoucher> {

	public CampanhaVoucherService(VicRepository<CampanhaVoucher> repository) {
		super(repository);
	}

}
