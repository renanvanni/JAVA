package exercicio2;

public class Aviao {
	//Atributos
	String modelo;
	String cor;
	String potencia;
	int velocidade, altitudeTotal;
	
	//M�todos
	void aceleracao (int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	void altitude (int altitude) {
		altitudeTotal = altitudeTotal + altitude;
	}
}
