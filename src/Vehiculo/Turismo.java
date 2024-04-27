package Vehiculo;

public abstract class Turismo extends Vehiculo{

	//atributos
	protected enum TiposAsiento {RECLINABLES, CUERO, CALEFACCION};
	private TiposAsiento asiento;
	protected double precio;
	protected double kmRecorridos;
	
	//constructor
	protected Turismo (String marca, String modelo, String numBastidor, int numPuertas, TiposAsiento asiento, double kmRecorridos) {
		super(marca, modelo, numBastidor, numPuertas);
		
		this.setAsiento(asiento);
		this.kmRecorridos = kmRecorridos;
	}

	//metodos
	protected TiposAsiento getAsiento() {
		return asiento;
	}

	protected void setAsiento(TiposAsiento asiento) {
		this.asiento = asiento;
	}
	
	public String toString() {
		return super.toString() + "; Tipo de asiento: " + asiento + "; Km recorridos: " + kmRecorridos + "km";
	}
	
	protected double calcularPrecioAlquiler(int dias) {
		return dias * precio;
	}
	
	protected abstract int getMaxVelocidad();

	protected double getKmRecorridos() {
		return kmRecorridos;
	}

	protected void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

}
