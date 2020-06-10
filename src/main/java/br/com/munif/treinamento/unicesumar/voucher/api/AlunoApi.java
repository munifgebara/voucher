package br.com.munif.treinamento.unicesumar.voucher.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.munif.framework.vicente.api.BaseAPI;
import br.com.munif.framework.vicente.application.BaseService;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Aluno;

@RestController
@RequestMapping("/api/alunos")
public class AlunoApi extends BaseAPI<Aluno> {

	private static final String ENTITY_NAME = "aluno";

	public AlunoApi(BaseService<Aluno> service) {
		super(service);
	}
}