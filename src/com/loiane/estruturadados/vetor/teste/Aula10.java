package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) throws Exception {
		
		
		VetorObjetos vetor  = new VetorObjetos(3);
		
		
		vetor.adiciona(3);
		vetor.adiciona("B");
		vetor.adiciona(true);
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		vetor.remove(2);

		System.out.println(vetor);
		
		System.out.println("---------------");
		
		
		Contato c1 = new Contato("Contato 1", "123456", "contato@gmail.com ");
		Contato c2 = new Contato("Contato 2", "654321", "contato@gmail.com ");
		Contato c3 = new Contato("Contato 3", "987654", "contato3@gmail.com ");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		

		System.out.println(vetor);
	}
}
