package br.com.munif.treinamento.unicesumar.voucher.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;

import br.com.munif.framework.vicente.domain.BaseEntity;

@Entity
@Audited
public class Voucher extends BaseEntity {

	private String codigoVoucher;
	@ManyToOne
	private Aluno indicador;
	@ManyToOne
	private CampanhaVoucher campanhaVoucher;
	
	public Voucher() {
		
	}

	public Voucher(String codigoVoucher, Aluno indicador, CampanhaVoucher campanhaVoucher) {
		this.codigoVoucher = codigoVoucher;
		this.indicador = indicador;
		this.campanhaVoucher = campanhaVoucher;
	}

	public String getCodigoVoucher() {
		return codigoVoucher;
	}

	public void setCodigoVoucher(String codigoVoucher) {
		this.codigoVoucher = codigoVoucher;
	}

	public Aluno getIndicador() {
		return indicador;
	}

	public void setIndicador(Aluno indicador) {
		this.indicador = indicador;
	}

	public CampanhaVoucher getCampanhaVoucher() {
		return campanhaVoucher;
	}

	public void setCampanhaVoucher(CampanhaVoucher campanhaVoucher) {
		this.campanhaVoucher = campanhaVoucher;
	}

}
