package br.com.inova.dao;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import br.com.inova.model.Perfil;

@Stateless
public class PerfilDao {
	
	@PersistenceContext(unitName = "dbBBDTVM", type = PersistenceContextType.TRANSACTION)
	protected EntityManager manager;
	
	
	
	public List<Perfil> listarTodos(){
		String sql = "Select p from Perfil p ";
		List<Perfil> lista = manager.createQuery(sql, Perfil.class)
				.getResultList();
		if(lista.isEmpty()) {
			Collections.emptyList();
		}
		return lista;
 	}

}
