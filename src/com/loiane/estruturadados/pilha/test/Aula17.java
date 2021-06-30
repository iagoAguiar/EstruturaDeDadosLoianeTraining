package com.loiane.estruturadados.pilha.test;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula17 {

	
	public static void main(String[] args) {
		
		
		Pilha<Integer> pilha = new Pilha<Integer>();


		
		for (int i=1; i<=11; i++){
			pilha.empilha(i);
		}
		pilha.empilha(15);
		
		System.out.println(pilha.topo());
		System.out.println(pilha);
		
	}
}

