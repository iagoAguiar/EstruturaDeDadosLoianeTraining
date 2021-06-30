package com.loiane.estruturadados.fila.exercicios;

import com.loiane.estruturadados.fila.Fila;

public class Aula21 {

	
	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		System.out.println(fila.espiar());
	}
}
