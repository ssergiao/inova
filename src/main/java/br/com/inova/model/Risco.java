package br.com.inova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "RISCO" , schema = "bus3")
@Data
public class Risco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_RISCO")
	private Integer id;
	
	@Column(name = "NM_RISCO")
	private String nome;
	
	
	private String descricao;
	
	
	
	
	
}
