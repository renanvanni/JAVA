package lista3;

import java.util.Scanner;

/*Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/
public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner receba = new Scanner(System.in);
		
		int[] numerosInteiros = new int[6];
		int somaPar = 0, somaImpar = 0;
		
		for(int i=0;i<numerosInteiros.length;i++) {
			
			System.out.print("Digite o " + (i+1) + "� n�mero inteiro: ");
			numerosInteiros[i] = receba.nextInt();
			
			if(numerosInteiros[i]%2 == 0) {
				somaPar = somaPar + numerosInteiros[i];
			}
			else if(numerosInteiros[i]%2 == 1) {
				somaImpar = somaImpar + numerosInteiros[i];
			}
		}
		System.out.print("S�o pares: ");
		for(int i=0;i<numerosInteiros.length;i++) {
			if(numerosInteiros[i]%2 == 0) {
				System.out.print(numerosInteiros[i] + ", ");
			}
		}
		System.out.println();
		System.out.print("S�o impares: ");
		for(int i=0;i<numerosInteiros.length;i++) {
			if(numerosInteiros[i]%2 == 1) {
				System.out.print(numerosInteiros[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("A soma dos n�meros pares �: " + somaPar);
		System.out.println("A soma dos n�meros impares �: " + somaImpar);
		
		receba.close();
	}

}
