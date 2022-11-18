package br.com.inova.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.inova.model.Fundo;

public class FundoService {
	
	public static final int LIMITE = 3;
	
	List<Fundo> fundos ;

	public FundoService(List<Fundo> fundos) {
		this.fundos = fundos;
	}
	
	/*
	 * Escolhe o melhor fundo baseado na rentabiliade de 180 dias
	 * Segundo o limite pre estabelido
	 */
	public List<Fundo> escolher(){
		List<Fundo> escolhido = new ArrayList<Fundo>();
		Collections.sort(fundos);
		Collections.reverse(fundos);
		
		int total = fundos.size() > LIMITE? LIMITE : fundos.size();
	
		for (int i = 0; i < total; i++) {
			escolhido.add(fundos.get(i));
		}
		return escolhido;
	}

}
