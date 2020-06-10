package br.com.munif.treinamento.unicesumar.voucher.repositorios;

import org.springframework.stereotype.Repository;

import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Aluno;

@Repository
public interface AlunoRepository extends VicRepository<Aluno> {

}
