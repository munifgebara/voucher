package br.com.munif.treinamento.unicesumar.voucher.entidades;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.envers.Audited;

import br.com.munif.framework.vicente.domain.BaseEntity;

@Entity
@Audited
public class CampanhaVoucher extends BaseEntity {
	private String codigoCampanha;
	@OneToMany
	private Set<Concurso> concursoLiberados;
	@OneToMany
	private Set<Polo> polosLiberados;
	
	public CampanhaVoucher() {
		
	}

	public CampanhaVoucher(String codigoCampanha, Set<Concurso> concursoLiberados, Set<Polo> polosLiberados) {
		this.codigoCampanha = codigoCampanha;
		this.concursoLiberados = concursoLiberados;
		this.polosLiberados = polosLiberados;
	}

	public String getCodigoCampanha() {
		return codigoCampanha;
	}

	public void setCodigoCampanha(String codigoCampanha) {
		this.codigoCampanha = codigoCampanha;
	}

	public Set<Concurso> getConcursoLiberados() {
		return concursoLiberados;
	}

	public void setConcursoLiberados(Set<Concurso> concursoLiberados) {
		this.concursoLiberados = concursoLiberados;
	}

	public Set<Polo> getPolosLiberados() {
		return polosLiberados;
	}

	public void setPolosLiberados(Set<Polo> polosLiberados) {
		this.polosLiberados = polosLiberados;
	}

}
