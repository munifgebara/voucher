package br.com.munif.treinamento.unicesumar.voucher.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.munif.framework.vicente.api.BaseAPI;
import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Candidato;

@RestController
@RequestMapping("/api/candidatos")
public class CandidatoApi extends BaseAPI<Candidato> {

	private static final String ENTITY_NAME = "candidato";

	public CandidatoApi(BaseService<Candidato> service) {
		super(service);
	}
}