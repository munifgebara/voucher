package br.com.munif.treinamento.unicesumar.voucher.entidades;

import javax.persistence.Entity;

import org.hibernate.envers.Audited;

import br.com.munif.framework.vicente.domain.BaseEntity;

@Entity
@Audited
public class Aluno extends BaseEntity {

	private String ra;
	private String nomeCompleto;
	private String cpf;
	private String curso;

	public Aluno() {

	}

	public Aluno(String ra, String nomeCompleto, String cpf, String curso) {
		this.ra = ra;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.curso = curso;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
