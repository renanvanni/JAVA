package exercicio3;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.setMarcaCelular("Apple");
		celular.setModelo("XR");
		celular.setCor("Preta");
		celular.setPeso(200);
		celular.setProcessador(2.65);
		
		System.out.println("A marca �:" + celular.getMarcaCelular());
		System.out.println("O modelo �: " + celular.getModelo());
		System.out.println("A cor �: " + celular.getCor());
		System.out.println("O peso do celular � de: " + celular.getPeso());
		System.out.println("E o processador � de: " + celular.getProcessador());

	}

}
