package br.com.generation.lista1;
/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/
import java.util.Scanner;

public class MediasAlunos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media, nota3;
		
		System.out.println("Digite a 1� nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a 2� nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Digite a 3� nota: ");
		nota3 = ler.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A nota �: " + media);
		
		ler.close();

	}

}
