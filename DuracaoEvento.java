package br.com.generation.lista1;
/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
import java.util.Scanner;

public class DuracaoEvento {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		a = ler.nextInt();
		
		b = a / 3600;
		System.out.println("Dura��o em horas �: " + b);
		
		c = ((a/60)-(b*60));
		System.out.println("Dura��o em minutos �: " + c);
		
		d = (a-(b*3600)-(c*60));
		System.out.println("Dura��o em segundos �: " + d);
		
		ler.close();
	}

}
