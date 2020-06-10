package br.com.munif.treinamento.unicesumar.voucher.entidades;

import javax.persistence.Entity;

import org.hibernate.envers.Audited;

import br.com.munif.framework.vicente.domain.BaseEntity;

@Entity
@Audited
public class Polo extends BaseEntity {

	private String nome;

	public Polo() {

	}

	public Polo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
