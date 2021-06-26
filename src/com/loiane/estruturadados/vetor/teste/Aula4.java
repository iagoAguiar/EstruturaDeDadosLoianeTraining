package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorString;

public class Aula4 {

	public static void main(String[] args) throws Exception {
		VetorString vetor  = new VetorString(20);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		
		System.out.println(vetor.getTamanho());
		
		System.out.println(vetor.toString());
	}
}
