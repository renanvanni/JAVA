package lista3;

import java.util.Scanner;

/*Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio
  um menu de op��es:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada.
Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o
da constante deve ser armazenado na pr�pria matriz.*/
public class Exercicio4 {

	public static void main(String[] args) {

		Scanner escreva = new Scanner(System.in);
		
		double[][] matrizUm = new double[2][2];
		double[][] matrizDois = new double[2][2];
		int operacao;
		
		for(int l=0;l<matrizUm.length;l++) {
			for(int c=0;c<matrizUm.length;c++) {
				System.out.printf("Digite o valor da 1� Matriz no ponto [%d][%d]: ", l, c);
				matrizUm[l][c] = escreva.nextDouble();
			}
		}
		for(int l=0;l<matrizDois.length;l++) {
			for(int c=0;c<matrizDois.length;c++) {
				System.out.printf("Digite o valor da 2� Matriz no ponto [%d][%d]: ", l, c);
				matrizDois[l][c] = escreva.nextDouble();
			}
		}
		System.out.println("Qual opera��o voc� deseja realizar?\n(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes");
		operacao = escreva.nextInt();
		
		if(operacao == 1) {
			System.out.println("Matriz 3:");
			for(int l=0;l<matrizDois.length;l++) {
				for(int c=0;c<matrizDois.length;c++) {
					System.out.print(matrizUm[l][c] + matrizDois[l][c] + " ");
				}
				System.out.println();
			}
		}
		else if(operacao == 2) {
			System.out.println("Matriz 3:");
			for(int l=0;l<matrizDois.length;l++) {
				for(int c=0;c<matrizDois.length;c++) {
					System.out.print(matrizUm[l][c] - matrizDois[l][c] + " ");
				}
				System.out.println();
			}
		}
		else if(operacao == 3) {
			String constante = "";
			System.out.println("Digite uma constante: ");
			constante = escreva.next();
			
			System.out.println("Matriz 1:");
			for(int l=0;l<matrizUm.length;l++) {
				for(int c=0;c<matrizUm.length;c++) {
					System.out.print(matrizUm[l][c] + " " + constante);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Matriz 2:");
			for(int l=0;l<matrizDois.length;l++) {
				for(int c=0;c<matrizDois.length;c++) {
					System.out.print(matrizDois[l][c] + " " + constante);
				}
				System.out.println();
			}
		}
		else if(operacao == 4) {
			System.out.println("Matriz 1:");
			for(int l=0;l<matrizUm.length;l++) {
				for(int c=0;c<matrizUm.length;c++) {
					System.out.print(matrizUm[l][c] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Matriz 2:");
			for(int l=0;l<matrizDois.length;l++) {
				for(int c=0;c<matrizDois.length;c++) {
					System.out.print(matrizDois[l][c] + " ");
				}
				System.out.println();
			}
		}
		escreva.close();
	}
}
