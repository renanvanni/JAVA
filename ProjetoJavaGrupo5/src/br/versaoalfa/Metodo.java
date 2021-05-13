package br.versaoalfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Metodo extends /*Herança*/ Acessibilidade{
	
	Scanner ler = new Scanner(System.in);
	Acessibilidade aces = new Acessibilidade();
	ArrayList<String> teste = new ArrayList();//Colletions
	
	public void cadastrarPessoa() {
		
		System.out.println("==Pesquisa IBGE==\n");
		System.out.println("Digite seu primeiro nome: ");
		aces.setNome(ler.next());
		
		System.out.println("Digite seu CPF: ");
		aces.setCpf(ler.next());
		
		System.out.println("Digite sua idade: ");
		aces.setIdade(ler.nextInt());
		
		cadastrarFamilia();
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
			aces.setEducacao("Sim");
		}else if (i == 2){
			aces.setEducacao("Não");
		}else {
			System.out.println("Opção inválida");
			return;
		}
		System.out.println("Tem acesso a internet? (Sim = 1/Não = 2)");
		d = ler.nextInt();
		if(d == 1) {
			aces.setInternet("Sim");
		}else if (d == 2){
			aces.setInternet("Não");
		}else {
			System.out.println("Opção inválida");
			return;
		}
		calculaVunerabilidade();
	}
	public void metodo2() {
		int i;
		
		System.out.println("Deseja cadastrar outra familia? ");
		i = ler.nextInt();
		
		if(i == 1) {
			limpaTela();
			cadastrarPessoa();
		}else if(i != 1){
			/*System.out.println("Nome: " + aces.getNome() + "\n");
			System.out.println("Idade: " + aces.getIdade());
			System.out.println(aces.getCpf());
			System.out.println(aces.getQtdPessoas());
			System.out.println(aces.getRendaFamiliar());
			System.out.println(aces.getGeladeira());
			System.out.println(aces.getCarro());
			System.out.println(aces.getTelevisao());
			System.out.println(aces.getComputador());
			System.out.println(aces.isEducacao());
			System.out.println(aces.isInternet());*/
			limpaTela();//Gambiarra
			System.out.println(teste);
			return;
		}
	}
	public void calculaVunerabilidade() {
		double renda = aces.getRendaFamiliar();
		int qtdPessoas = aces.getQtdPessoas();
		String educacao = aces.getEducacao(), internet = aces.getInternet();
		
		if(renda < 1100 && educacao == "Não" && internet == "Não") {
			System.out.println("Ajuda urgente!");
			System.out.println("Prioridade 3");
		}else if(renda < 1100 && educacao == "Não" && internet == "Sim") {
			System.out.println("Prioridade 3");
		}else if(renda < 1100 && educacao == "Sim" && internet == "Não") {
			System.out.println("Prioridade 3");
		}else if(renda < 1100 && educacao == "Sim" && internet == "Sim") {
			System.out.println("Prioridade 3");
		}else if(renda <= 1600 && educacao == "Não" && internet == "Não" && qtdPessoas >= 5 && renda >= 1101) {
			System.out.println("Prioridade 2");
		}else if(renda <= 1600 && educacao == "Não" && internet == "Sim" && qtdPessoas >= 5 && renda >= 1101) {
			System.out.println("Prioridade 2");
		}else if(renda <= 1600 && educacao == "Sim" && internet == "Não" && qtdPessoas >= 5 && renda >= 1101) {
			System.out.println("Prioridade 1");
		}else if(renda <= 1600 && educacao == "Sim" && internet == "Sim" && qtdPessoas >= 5 && renda >= 1101) {
			System.out.println("Prioridade 1");
		}else {
			System.out.println("Familia OK");
		}
		teste.add("\nNome: "   + aces.getNome()  + "\n" +
                "Idade: "  + aces.getIdade() + "\n" +
                "CPF: " + aces.getCpf() + "\n" +
                "Quantidade Pessoas: "+ aces.getQtdPessoas() + "\n" +
                "Renda Familiar: "+ aces.getRendaFamiliar() + "\n" +
                "Geladeiras: " + aces.getGeladeira() + "\n" +
                "Carros: "+ aces.getCarro()+ "\n" +
                "Televisores: " + aces.getTelevisao()+ "\n" +
                "Computadores: "+ aces.getComputador()+ "\n" +
                "Educação: "+ aces.getEducacao()+ "\n" +
                "Internet: "+ aces.getInternet() + "\n");
		metodo2();
	}
	public void limpaTela() {
		for (int i = 0; i < 50; ++i) {  
			 System.out.println();  
		}
		
	}
}
