package collectionsEx3;

public class Estoque {

	private String nomeProduto;
	private int quantidade;
	
	public Estoque(String nomeProduto, int quantidade) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String toString() {
		return "O produto: " + this.nomeProduto + ", tem: " + this.quantidade + " itens";
	}
}
