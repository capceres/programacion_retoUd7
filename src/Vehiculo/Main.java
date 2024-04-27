package Vehiculo;
import Vehiculo.Turismo.TiposAsiento;

public class Main {

	public static void main(String[] args) {
		
		//se crean 2 objetos de tipo Taxi
		Taxi taxi1 = new Taxi("Ford", "Mustang", "WVWZZZ1JZ1W357894", 4, TiposAsiento.RECLINABLES, 1200.3, 7.5);
		Taxi taxi2 = new Taxi("Ford", "Mustang", "VF1RFAEZH35467892", 4, TiposAsiento.CUERO, 2600, 9);
		
		System.out.print("DATOS DEL TAXI 1: \n" + taxi1.toString());
		System.out.print("DATOS DEL TAXI 2: \n" + taxi2.toString());
		
		//se crean 2 objetos de tipo Particular
		Particular particular1 = new Particular("Peugeot", "307 SW", "WBAEV110X0KL48357", 4, TiposAsiento.RECLINABLES, 600.56, "María Pez", true);
		Particular particular2 = new Particular("Toyota", "Yaris", "JHMAP21401T000923", 4, TiposAsiento.CUERO, 144567.45, "Juanan Polo", true);
		
		System.out.print("DATOS DEL PARTICULAR 1: \n" + particular1.toString());
		System.out.print("DATOS DEL PARTICULAR 2: \n" + particular2.toString());
		
		//se crean 2 objetos de tipo Autobus
		Autobus autobus1 = new Autobus("Volvo", "9800", "YS3FB49S211011590", 3, 56, 15);
		System.out.print("DATOS DEL AUTOBÚS 1: \n" + autobus1.toString());
		
		//se muestra cuantos vehiculos estan funcionando
		System.out.print("Vehículos en funcionamiento: " + Vehiculo.getCantVehiculosFuncionando() + ".\n");
		
		//se reinicia a 25000km el cuentakilometros del taxi1
		taxi1.reiniciarContador(taxi1.getKmRecorridos(), 25000);
	
		//se calcula el coste del trayecto del taxi1
		System.out.print("\nEl coste del trayecto del taxi 1 será: " + taxi1.CalcularCosteTrayecto() + "€.\n");
		
		//se calcula el precio del alquiler de X dias del particular2
		int numDias = 5;
		System.out.print("\nEl alquiler de " + numDias + " dias del particular cuesta: " + particular2.calcularPrecioAlquiler(numDias) + "€.\n");
	
		
	}

}
