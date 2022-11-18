package br.com.inova.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.inova.dao.PerfilDao;
import br.com.inova.dao.RentabilidadeDao;
import br.com.inova.dao.FundoDao;
import br.com.inova.model.Fundo;
import br.com.inova.model.Perfil;
import br.com.inova.model.Rentabilidade;

@Stateless
public class FacadeService {
	
	@EJB
	private PerfilDao perfiDao;
	
	@EJB
	private FundoDao fundoDao;
	
	@EJB
	private RentabilidadeDao rentabilidadeDao;

	
	public List<Perfil> getPerfis() {
		return perfiDao.listarTodos();
	}
	
	public Rentabilidade getRentabilidade(Fundo fundo) {
		return rentabilidadeDao.getRentabilidade(fundo);
	}


	public List<Fundo> getFundoPorPerfil(Perfil perfil) {
		return fundoDao.listarFundos(perfil);
	}


	

}
