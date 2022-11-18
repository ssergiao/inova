package br.com.inova.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.inova.model.Fundo;
import br.com.inova.model.Perfil;
import br.com.inova.service.FacadeService;
import br.com.inova.service.FundoService;

@ManagedBean(name = "portBean")
@ViewScoped
public class PortifolioBean {
	
	@EJB
	private FacadeService service;
	
	private List<Perfil> perfis;
	
	private List<Fundo> fundos;
	
	private Integer limite = 3;
	
	
	
	@PostConstruct
	public void iniciar () {
		perfis = service.getPerfis();
	}
	
	
	public void escolherPerfil(Perfil perfil) {
		setFundos(service.getFundoPorPerfil(perfil));
		for(Fundo f : fundos) {
			f.setRentabilidade(service.getRentabilidade(f));
		}
		FundoService service = new FundoService(fundos);
		setFundos(service.escolher());
	}
	
	
	public List<Perfil> getPerfis() {
		return perfis;
	}




	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}


	public List<Fundo> getFundos() {
		return fundos;
	}


	public void setFundos(List<Fundo> fundos) {
		this.fundos = fundos;
	}


	public Integer getLimite() {
		return limite;
	}


	public void setLimite(Integer limite) {
		this.limite = limite;
	}





	
	
	

	 
	 

}
