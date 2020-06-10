package br.com.munif.treinamento.unicesumar.voucher.repositorios;

import org.springframework.stereotype.Repository;

import br.com.munif.framework.vicente.application.VicRepository;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Candidato;

@Repository
public interface CandidatoRepository extends VicRepository<Candidato> {

}
