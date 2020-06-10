package br.com.munif.treinamento.unicesumar.voucher.negocios;

import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Aluno;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Voucher;

public class VoucherService extends BaseService<Voucher> {

	public VoucherService(VicRepository<Voucher> repository) {
		super(repository);
	}

}
