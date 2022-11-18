package br.com.inova.dao;

import java.util.Collections;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import br.com.inova.model.Fundo;
import br.com.inova.model.Perfil;

@Stateless
public class FundoDao {
	
	@PersistenceContext(unitName = "dbBBDTVM", type = PersistenceContextType.TRANSACTION)
	protected EntityManager manager;
	
	
	public List<Fundo> listarFundos(Perfil perfil ) {
		String sql = "SELECT f.* FROM  bus3.FUNDO f "
				+ "JOIN bus3.RISCO r ON r.ID_RISCO = f.ID_RISCO "
				+ "JOIN bus3.PERFIL_RISCO p ON p.ID_RISCO = r.ID_RISCO "
				+ "WHERE p.ID_PERFIL =:perfil_id AND DT_ENCERRAMENTO is null ORDER BY f.ID_RISCO DESC";
		
		List<Fundo> lista = manager.createNativeQuery(sql, Fundo.class)
				.setParameter("perfil_id" , perfil.getId())
				.getResultList();
		
		if(lista.isEmpty()) {
			return Collections.emptyList();
		}
		
		return lista;
	}

}
