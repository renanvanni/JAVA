package lista2;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
public class Exercicio5DoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int numero, soma=0;
		
		do {
			System.out.printf("Digite um n�mero: ");
			numero = ler.nextInt();
			
			soma = soma + numero;
		}while(numero != 0);
		
		System.out.printf("A soma dos n�meros digitados �: " + soma);
		ler.close();
	}

}
