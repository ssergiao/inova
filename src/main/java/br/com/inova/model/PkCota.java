package br.com.inova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


import lombok.Data;
@Data
public class PkCota implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	public PkCota() {
	}
	
	public PkCota(Cota cota) {
		this.dataCota = cota.getDataCota();
		this.fundo = cota.getFundo().getCod();
	}
	
	public PkCota(Date dataCota, Integer fundo) {
		this.dataCota = dataCota;
		this.fundo = fundo;
	}
	
	private Date dataCota; 
	private Integer fundo;

}
