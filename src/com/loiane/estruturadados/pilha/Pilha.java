package com.loiane.estruturadados.pilha;

import java.util.Arrays;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
	
	
	
	public Pilha() {
		super();
	}
	

	public Pilha (int capacidade) {
		super(capacidade);
		}


	public int tamanho() {
		return this.tamanho; 
	}
	
	@Override
	public String toString() {
		return "Pilha [elementos=" + Arrays.toString(elementos) + ", tamanho=" + tamanho + "]";
	}
	



	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	public T topo() {
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[tamanho-1];
	}
	
	
	public T desempilha() {
		tamanho--;
		return topo();
	}

}
























