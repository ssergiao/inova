package br.com.inova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Table(name = "FUNDO" , schema = "bus3")
@Data
public class Fundo implements Serializable , Comparable<Fundo>{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "COD_FUNDO")
	private Integer cod;
	
	@Column(name = "CNPJ_FUNDO")
	private String cnpj;
	
	@Column(name = "NM_FUNDO")
	private String nome;
	
	@Column(name = "DT_ABERTURA")
	private Date dataAbertura;
	
	@Column(name = "DT_ENCERRAMENTO")
	private Date dataEncerramento;
	
	@JoinColumn(name = "ID_RISCO" , referencedColumnName = "ID_RISCO")
	@ManyToOne
	private Risco risco;
	
	@Transient
	private Rentabilidade rentabilidade;

	@Override
	public int compareTo(Fundo o) {
		return this.rentabilidade.compareTo(o.getRentabilidade());
	}
	
	

}
