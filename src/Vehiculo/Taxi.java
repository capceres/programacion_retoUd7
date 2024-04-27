package Vehiculo;

public class Taxi extends Turismo implements Calculable, Iniciable{
	
	//atributos
	private double importeInicial = 2;
	private double precio = 50;

	private double importeKm;
	
	//constructor
	public Taxi (String marca, String modelo, String numBastidor, int numPuertas, TiposAsiento asiento, double kmRecorridos, double importeKm) {
		super(marca, modelo, numBastidor, numPuertas, asiento, kmRecorridos);
		
		this.setImporteKm(importeKm);
	}
	
	
	//metodos
	@Override
	public int getMaxVelocidad() {
		return 200;
	}
	
	@Override
	public double CalcularCosteTrayecto() {
		return importeInicial + (this.getKmRecorridos() * this.importeKm);
	}

	@Override
	public void reiniciarContador(double kmRecorridos, double nuevosKilometros) {
		System.out.println("\nEl taxi tiene acumulados un total de: " + kmRecorridos + "km.\n");
		this.setKmRecorridos(nuevosKilometros);
		System.out.print("\nEl cuentakilómetros ha sido reiniciado a: " + this.getKmRecorridos() + "km.\n");
	}
	
	@Override
	public double calcularPrecioAlquiler(int dias) {
		return dias * precio;
	}

	public double getImporteKm() {
		return importeKm;
	}

	public void setImporteKm(double importeKm) {
		this.importeKm = importeKm;
	}
	
	public String toString() {
		return super.toString() + "; Importe inicio: " + importeInicial + "€; " + "Coste del trayecto: " + CalcularCosteTrayecto() + "€" + ". \n\n";
	}



	

	
}
