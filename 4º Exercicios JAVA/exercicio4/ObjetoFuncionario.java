package exercicio4;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		
		Funcionario colaborador = new Funcionario();
		
		colaborador.setNome("Renan Gon�alves Vanni");
		colaborador.setAltura(1.87);
		colaborador.setPeso(70);
		colaborador.setCodigo(729898);
		
		System.out.println("O nome do(a) funcion�rio(a) �: " + colaborador.getNome());
		System.out.println("A altura � " + colaborador.getAltura() + " e peso de " + colaborador.getPeso() + "Kg");
		System.out.println("Seu c�digo �: " + colaborador.getCodigo());
	}

}
