package br.com.munif.treinamento.unicesumar.voucher.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.munif.framework.vicente.api.BaseAPI;
import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.treinamento.unicesumar.voucher.entidades.CampanhaVoucher;

@RestController
@RequestMapping("/api/campanhavouchers")
public class CampanhaVoucherApi extends BaseAPI<CampanhaVoucher> {

	private static final String ENTITY_NAME = "campanhavoucher";

	public CampanhaVoucherApi(BaseService<CampanhaVoucher> service) {
		super(service);
	}
}