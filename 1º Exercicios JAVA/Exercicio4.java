package br.com.generation.lista1;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e 
 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
 * quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		double raiz, quadrado;
		
		System.out.println("Digite um n�mero qualquer: ");
		numero = ler.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("Esse n�mero � PAR");
			raiz = Math.sqrt(numero);
			System.out.println("A raiz desse n�mero �: " + raiz);
		}else {
			System.out.println("Esse n�mero � IMPAR");
			quadrado = Math.pow(numero, 2);
			System.out.println("O n�mero elevado ao quadrado �: " + quadrado);
		}
		ler.close();
	}
}
