package br.com.inova.dao;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import br.com.inova.model.Cota;
import br.com.inova.model.Fundo;
import br.com.inova.model.PkCota;
import br.com.inova.model.Rentabilidade;


@Stateless
public class RentabilidadeDao {
	@PersistenceContext(unitName = "dbBBDTVM", type = PersistenceContextType.TRANSACTION)
	protected EntityManager manager;

	
	public Rentabilidade getRentabilidade(Fundo fundo) {
		Rentabilidade rentabilidade = new Rentabilidade();
		PkCota id = new PkCota(getMaxCota(fundo));
		try {
			rentabilidade = manager.find(Rentabilidade.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rentabilidade;
	}
	
	private Cota getMaxCota(Fundo fundo) {
		String sql = "SELECT * FROM bus3.COTAS c "
				+ "WHERE c.COD_FUNDO =:fundo_id AND c.DT_COTA =("
				+ "SELECT MAX(DT_COTA) FROM bus3.COTAS WHERE COD_FUNDO =c.COD_FUNDO )";
		
		Cota cota = (Cota) manager.createNativeQuery(sql , Cota.class)
				.setParameter("fundo_id", fundo.getCod())
				.getSingleResult();
		
		return cota;
		
		
	}
	
	
}
