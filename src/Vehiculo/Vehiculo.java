package Vehiculo;

public abstract class Vehiculo {
	
	//atributos
	private String marca;
	private String modelo;
	private String numBastidor;
	private int numPuertas;
	private static int CantVehiculosFuncionando = 0;
	
	//constructor
	protected Vehiculo (String marca, String modelo, String numBastidor, int numPuertas) {
		this.marca = marca;
		this.modelo = modelo;
		this.numBastidor = numBastidor;
		this.numPuertas = numPuertas;
		
		++CantVehiculosFuncionando;
	}
	
	//metodos
	protected String getMarca() {
		return marca;
	}
	
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	
	protected String getModelo() {
		return modelo;
	}
	
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	protected String getNumBastidor() {
		return numBastidor;
	}
	
	protected void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}
	
	protected int getNumPuertas() {
		return numPuertas;
	}
	
	protected void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	protected static int getCantVehiculosFuncionando() {
		return CantVehiculosFuncionando;
	}
	
	public String toString() {
		 return "Marca: " + marca + "; " + "Modelo: " + modelo + "; " + "Nº bastidor: " + numBastidor + "; "  + "Nº puertas: " + numPuertas;
	}

}
