package br.com.inova.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PERFIL" , schema = "bus3")
@Data
public class Perfil implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_PERFIL")
	private Integer id;
	
	@Column(name = "NM_PERFIL")
	private String nome;
	
	private String descricao;

}
