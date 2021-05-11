package br.versaoalfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Metodo extends Acessibilidade{
	
	Scanner ler = new Scanner(System.in);
	Acessibilidade aces = new Acessibilidade();
	ArrayList<String> teste = new ArrayList();
	
	public void cadastrarPessoa() {
		
		for(int i=0; i<=1;i++) {
		System.out.println("==Pesquisa IBGE==\n");
		System.out.println("Digite seu primeiro nome: ");
		aces.setNome(ler.next());
		
		System.out.println("Digite seu CPF: ");
		aces.setCpf(ler.next());
		
		System.out.println("Digite sua idade: ");
		aces.setIdade(ler.nextInt());
		
		teste.add(aces.getNome() +";"+ aces.getIdade() + ";" + aces.getCpf() + ";" + aces.getQtdPessoas() + ";" + aces.isInternet());
		cadastrarFamilia();
		}
	}
	public void cadastrarFamilia() {
		System.out.println("Digite a quantidade de pessoas na casa: ");
		aces.setQtdPessoas(ler.nextInt());
		
		System.out.println("Digite a renda familiar: ");
		aces.setRendaFamiliar(ler.nextDouble());
		
		System.out.println("Digite a quantidade de geladeiras: ");
		aces.setGeladeira(ler.nextInt());
		
		System.out.println("Digite a quantidade de carros: ");
		aces.setCarro(ler.nextInt());
		
		System.out.println("Digite a quantidade de televisões: ");
		aces.setTelevisao(ler.nextInt());
		
		System.out.println("Digite a quantidade de computadores: ");
		aces.setComputador(ler.nextInt());
		
		cadastrarAcessibilidade();
	}
	public void cadastrarAcessibilidade() {
		int i;
		int d;
		
		System.out.println("Tem acesso a educação? (Sim = 1/Não = 2)");
		i = ler.nextInt();
		if(i == 1) {
			aces.setEducacao(true);
		}else if (i == 2){
			aces.setEducacao(false);
		}else {
			System.out.println("Opção inválida");
			return;
		}
		System.out.println("Tem acesso a internet? (Sim = 1/Não = 2)");
		d = ler.nextInt();
		if(d == 1) {
			aces.setInternet(true);
		}else if (d == 2){
			aces.setInternet(false);
		}else {
			System.out.println("Opção inválida");
			return;
		}
		System.out.println(aces.getNome());
		System.out.println(aces.getIdade());
		System.out.println(aces.getCpf());
		System.out.println(aces.getQtdPessoas());
		System.out.println(aces.getRendaFamiliar());
		System.out.println(aces.getGeladeira());
		System.out.println(aces.getCarro());
		System.out.println(aces.getTelevisao());
		System.out.println(aces.getComputador());
		System.out.println(aces.isEducacao());
		System.out.println(aces.isInternet());
		
		metodo2();
	}
	public void metodo2() {
		int i;
		
		System.out.println("Deseja cadastrar outra familia? ");
		i = ler.nextInt();
		
		if(i == 1) {
			cadastrarPessoa();
		}else {
			System.out.println(teste);
			return;
		}
	}
}
