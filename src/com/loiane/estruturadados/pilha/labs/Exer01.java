package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer01 {

	public static void main(String[] args) {
		
		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<10;i++) {
			
			System.out.println("Entre com um número");
			
			int num = scan.nextInt();
			if(num==0) {
				System.out.println(par.desempilha());
			}
			if (num%2==0) {
				par.empilha(num);
				System.out.println("Número par empilhado");
			} else {
				impar.empilha(num);
				System.out.println("Número impar empilhado");
			}
		}
	
		
		
		
		
		
		
		
	}	
}










