package Vehiculo;

public class Particular extends Turismo implements Iniciable{
	
	//atributos
	private String propietario;
	private boolean conAireAcondicionado;
	private double precio = 30;
	
	//constructor
	public Particular (String marca, String modelo, String numBastidor, int numPuertas, TiposAsiento asiento, double kmRecorridos, String propietario, boolean conAireAcondicionado) {
		super(marca, modelo, numBastidor, numPuertas, asiento, kmRecorridos);
		
		this.setPropietario(propietario);
		this.setConAireAcondicionado(conAireAcondicionado);
		
	}


	
	//metodos
	@Override
	public void reiniciarContador(double kmRecorridos, double nuevosKilometros) {
		System.out.println("Este vehículo es un particular.");
	}
	
	@Override
	public double calcularPrecioAlquiler(int dias) {
		return dias * precio;
	}
	
	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public boolean isConAireAcondicionado() {
		return conAireAcondicionado;
	}

	public void setConAireAcondicionado(boolean conAireAcondicionado) {
		this.conAireAcondicionado = conAireAcondicionado;
	}

	@Override
	public int getMaxVelocidad() {
		return 220;
	}
	
	public String toString() {
		return super.toString() + "; Propietario: " + propietario + "; " + "Con aire acondicionado: " +  conAireAcondicionado + ". \n\n";
	}


	
}
