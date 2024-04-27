package Vehiculo;

public class Autobus extends Vehiculo {
	
	//atributos
	private int numero;
	private int numParadas;
	
	//constructor
	public Autobus(String marca, String modelo, String numBastidor, int numPuertas, int numero, int numParadas) {
		super (marca, modelo, numBastidor, numPuertas);
		this.setNumero(numero);
		this.setNumParadas(numParadas);
	}

	//metodos
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}
	
	public String toString() {
		return super.toString() + "; Número: " + numero + "; " + "Nº paradas: " +  numParadas + ". \n\n";
	}
	
	

}
