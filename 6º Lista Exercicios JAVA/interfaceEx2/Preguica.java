package interfaceEx2;

public class Preguica implements Animal{
	@Override
	public void nome() {
		System.out.println("Nome da pregui�a: Pink");
	}
	@Override
	public void idade() {
		System.out.println("tem " + 25 + " anos");
	}
	@Override
	public void som() {
		System.out.println("O som �: WEEEEE");
	}
	void acao() {
		System.out.println("E ele sobe em �rvores...\n");
	}
}
