package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula6 {

	public static void main(String[] args) throws Exception {
		Vetor vetor  = new Vetor(20);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.busca("elemento 2"));
		System.out.println(vetor.busca("elemento 6"));
	}
}
