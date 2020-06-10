package br.com.munif.treinamento.unicesumar.voucher.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;

import br.com.munif.framework.vicente.domain.BaseEntity;

@Entity
@Audited
public class Candidato extends BaseEntity {

	private String nomeCompleto;
	private String cpf;
	private String curso;
	@ManyToOne
	private Polo polo;
	@ManyToOne
	private Voucher voucher;
	private Boolean pago;
	@ManyToOne
	private Concurso concurso;

	public Candidato() {

	}

	public Candidato(String nomeCompleto, String cpf, String curso, Polo polo, Voucher voucher, Boolean pago,
			Concurso concurso) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.curso = curso;
		this.polo = polo;
		this.voucher = voucher;
		this.pago = pago;
		this.concurso = concurso;
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

	public Polo getPolo() {
		return polo;
	}

	public void setPolo(Polo polo) {
		this.polo = polo;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	public Boolean getPago() {
		return pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}

	public Concurso getConcurso() {
		return concurso;
	}

	public void setConcurso(Concurso concurso) {
		this.concurso = concurso;
	}

}
