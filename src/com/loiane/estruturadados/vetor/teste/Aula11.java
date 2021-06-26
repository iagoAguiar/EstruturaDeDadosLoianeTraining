package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) throws Exception {
		
		
		Lista<String> vetor  = new Lista<String>(3);
		
		
		vetor.adiciona("B");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		vetor.remove(2);

		System.out.println(vetor);
		
		System.out.println("---------------");
		
	}
}
