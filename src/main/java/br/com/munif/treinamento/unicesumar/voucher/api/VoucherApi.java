package br.com.munif.treinamento.unicesumar.voucher.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.munif.framework.vicente.api.BaseAPI;
import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Voucher;

@RestController
@RequestMapping("/api/vouchers")
public class VoucherApi extends BaseAPI<Voucher> {

	private static final String ENTITY_NAME = "voucher";

	public VoucherApi(BaseService<Voucher> service) {
		super(service);
	}
}