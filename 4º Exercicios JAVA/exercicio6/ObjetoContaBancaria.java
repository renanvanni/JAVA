package exercicio6;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cb = new ContaBancaria();
		cb.setNome("Renan");
		cb.setConta("x65412");
		cb.setSenha("abcd");
		cb.setValorEntrada(5000);
		
		System.out.println("Dados da conta banc�ria do cliente");
		System.out.println("O nome do usuario �: " + cb.getNome());
		System.out.println("A conta �: " + cb.getConta());
		System.out.println("A senha �: " + cb.getSenha());
		System.out.println("Esse cliente tem a entrada de: " + cb.getValorEntrada() + " reais ao m�s");
	}
}
