package br.com.generation.lista1;

import java.util.Scanner;
/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o 1� n�mero: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("O maior n�mero � o 1� e ele vale: " + num1);
		}
		else if(num2>num3 && num2>num1) {
			System.out.println("O maior n�mero � o 2� e ele vale: " + num2);
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("O maior n�mero � o 3� e ele vale: " + num3);
		}
		
		ler.close();
	}

}
