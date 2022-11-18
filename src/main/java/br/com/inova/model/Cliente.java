package br.com.inova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CLIENTE" , schema = "bus3")
@Data
public class Cliente implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	private String Identificacao;
	private String documento;
	private Perfil perfil;

}
