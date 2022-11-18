package br.com.inova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PERFIL_RISCO" , schema = "bus3")
@IdClass(value = PkPerfilRisco.class)
@Data
public class PerfilRisco implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@JoinColumn(name = "ID_PEFIL" , referencedColumnName = "ID_PERFIL")
	@ManyToOne
	private Perfil perfil;
	
	@Id
	@JoinColumn (name = "ID_RISCO" , referencedColumnName = "ID_RISCO")
	@ManyToOne
	private Risco risco;
	

}
