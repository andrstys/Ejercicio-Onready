package vehiculosInterface;

public class Autos extends Vehiculos {

	private int puertas;
	
	public Autos() {
		super();
	}
	
	public Autos(String marca, String modelo, int puertas, double precio) {
		super(marca,modelo,precio);
		this.puertas=puertas;		
	}
	
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	
	//metodo especializado
	
	public void mostrarDescripcion() {
		System.out.print("Puertas: "+puertas+" // ");
	}
	
}
