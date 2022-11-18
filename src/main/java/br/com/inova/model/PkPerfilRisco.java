package br.com.inova.model;

import java.io.Serializable;

import lombok.Data;
@Data
public class PkPerfilRisco implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer perfil;
	private Integer risco;
	
	public PkPerfilRisco() {
	}
	
	
	public PkPerfilRisco(Integer perfil, Integer risco) {
		this.perfil = perfil;
		this.risco = risco;
	}
	
	

	
	

}
