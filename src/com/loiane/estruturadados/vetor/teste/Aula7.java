package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula7 {

	public static void main(String[] args) throws Exception {
		
		
		Vetor vetor  = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "A");

		System.out.println(vetor);
		
		
		vetor.adiciona(3, "D");
		
		System.out.println(vetor);
		
	}
}
