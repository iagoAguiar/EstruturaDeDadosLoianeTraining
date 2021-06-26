package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorString;

public class Aula9 {

	public static void main(String[] args) throws Exception {
		
		
		VetorString vetor  = new VetorString(3);
		
		
		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		vetor.remove(2);

		System.out.println(vetor);
		
	
		
	}
}
