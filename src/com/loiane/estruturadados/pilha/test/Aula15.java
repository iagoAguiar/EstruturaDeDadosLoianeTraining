package com.loiane.estruturadados.pilha.test;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula15 {

	
	public static void main(String[] args) {
		
		
		Pilha<Integer> pilha = new Pilha<Integer>();


		System.out.println(pilha.estaVazia());
		
		for (int i=1; i<=11; i++){
			pilha.empilha(i);
		}
		
		System.out.println(pilha.estaVazia());
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}
}

