package vehiculosInterface;

public class Motos extends Vehiculos{
	
		private String cc;
		
		public Motos() {
			super();
		}
		
		public Motos(String marca, String modelo, String cc, double precio) {
			super(marca,modelo,precio);
			this.cc=cc;		
		}
		
		public String getCC() {
			return cc;
		}
		public void setPuertas(String cc) {
			this.cc=cc;
		}
		
		//metodo especializado
		
		public void mostrarDescripcion() {
			System.out.print("Cilindrada: "+cc+" // ");
		}		
	}
