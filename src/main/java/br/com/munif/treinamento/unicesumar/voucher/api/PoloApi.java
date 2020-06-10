package br.com.munif.treinamento.unicesumar.voucher.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.munif.framework.vicente.api.BaseAPI;
import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Polo;

@RestController
@RequestMapping("/api/polos")
public class PoloApi extends BaseAPI<Polo> {

	private static final String ENTITY_NAME = "polo";

	public PoloApi(BaseService<Polo> service) {
		super(service);
	}
}