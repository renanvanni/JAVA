package exercicio5;

public class ObjetoPatinete {

	public static void main(String[] args) {

		Patinete pesquisa = new Patinete();
		
		pesquisa.setPreco(500);
		pesquisa.setTamanho("G");
		pesquisa.setCor("Prata");
		pesquisa.setDobravel("Sim");
		
		System.out.println("O pre�o desse patinete �: " + pesquisa.getPreco() + " reais");
		System.out.println("O tamanho �: " + pesquisa.getTamanho());
		System.out.println("A cor �: " + pesquisa.getCor());
		System.out.println("Ele � dobravel? " + pesquisa.getDobravel());
	}

}
