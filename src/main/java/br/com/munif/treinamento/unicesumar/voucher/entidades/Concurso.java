package br.com.munif.treinamento.unicesumar.voucher.entidades;

import javax.persistence.Entity;

import org.hibernate.envers.Audited;

import br.com.munif.framework.vicente.domain.BaseEntity;

@Entity
@Audited
public class Concurso extends BaseEntity {

	private Integer ano;
	private Integer semestre;
	
	public Concurso() {
		
	}

	public Concurso(Integer ano, Integer semestre) {
		this.ano = ano;
		this.semestre = semestre;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

}
