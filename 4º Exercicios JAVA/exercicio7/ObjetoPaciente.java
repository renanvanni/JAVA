package exercicio7;

public class ObjetoPaciente {

	public static void main(String[] args) {
		
		Paciente fixa = new Paciente();
		
		fixa.setNome("Roberto");
		fixa.setIdade(50);
		fixa.setAlergia("Sim, a camar�o");
		fixa.setSeuDiagnostico("Estou com dores nas costas");
		fixa.setSuaPressao("12.4");
		
		System.out.println("Ficha do paciente:");
		System.out.println("Nome do paciente: " + fixa.getNome());
		System.out.println("Sua idade �: " + fixa.getIdade());
		System.out.println("Possu� alguma alergia? " + fixa.getAlergia());
		System.out.println("Quais sintomas o paciente esta sentindo? " + fixa.getSeuDiagnostico());
		System.out.println("A press�o aferida �: " + fixa.getSuaPressao());
	}

}
