package com.loiane.estruturadados.pilha.test;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula16 {

	
	public static void main(String[] args) {
		
		
		Pilha<Integer> pilha = new Pilha<Integer>();


		
		for (int i=1; i<=11; i++){
			pilha.empilha(i);
		}

		
		
		
		System.out.println(pilha.desempilha());
		
		
	}
}

