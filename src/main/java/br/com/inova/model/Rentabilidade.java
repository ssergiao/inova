package br.com.inova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "RENTABILIDADE" , schema = "bus3")
@IdClass(value = PkCota.class)
public class Rentabilidade implements Serializable, Comparable<Rentabilidade>{
	
	@Id
	@Column(name = "DT_COTA")
	private Date dataCota ;
	@Id
	@Column(name = "COD_FUNDO")
	private Integer fundo;
	private BigDecimal d30;
	private BigDecimal d90;
	private BigDecimal d180;
	private BigDecimal d360;
	
	
	@Override
	public int compareTo(Rentabilidade o) {
		return this.d180.compareTo(o.getD180());
	}
	
	

}
