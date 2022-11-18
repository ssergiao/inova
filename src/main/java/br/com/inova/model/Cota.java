package br.com.inova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "COTAS" , schema = "bus3")
@IdClass(value = PkCota.class)
@Data
public class Cota implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DT_COTA")
	private Date dataCota;
	
	@Id
	@JoinColumn(name = "COD_FUNDO" , referencedColumnName = "COD_FUNDO")
	@ManyToOne
	private Fundo fundo;
	
	@Column(name = "COTA")
	private BigDecimal valorCota;
	
}
