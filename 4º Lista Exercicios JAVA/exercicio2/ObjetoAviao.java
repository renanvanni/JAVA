package exercicio2;

public class ObjetoAviao {
	
	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		
		a1.modelo = "Boeing";
		a1.cor = "Branco";
		a1.potencia = "165 mil cv";
		a1.velocidade = 800;
		a1.altitudeTotal = 0;
		
		a1.aceleracao(100);
		System.out.println("Ap�s a acelera��o o avi�o estava a " + a1.velocidade + "km/h");
		
		a1.altitude(15000);
		System.out.println("A altitude m�xima que o avi�o alcan�ou na viagem foi: " + a1.altitudeTotal + " metros");
	}

}
