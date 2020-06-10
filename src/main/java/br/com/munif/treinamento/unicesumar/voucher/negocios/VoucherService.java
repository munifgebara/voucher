package br.com.munif.treinamento.unicesumar.voucher.negocios;

import org.springframework.stereotype.Service;

import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Voucher;

@Service
public class VoucherService extends BaseService<Voucher> {

	public VoucherService(VicRepository<Voucher> repository) {
		super(repository);
	}

}
