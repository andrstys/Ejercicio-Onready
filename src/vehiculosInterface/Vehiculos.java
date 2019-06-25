package vehiculosInterface;

import java.text.DecimalFormat;


public abstract class Vehiculos implements ListadoVehiculos {

	protected String marca;
	protected String modelo;
	protected double precio;
	
	DecimalFormat format = new DecimalFormat("###,###.00");
	
	public Vehiculos() {
	}
	
	public Vehiculos(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio=precio;
	}
	
	//ListadoVehiculos
	public void mostrarMarca() {
		System.out.print("Marca: "+marca+" // ");
	}
	
	public void mostrarModelo() {
		System.out.print("Modelo: " + modelo+" // ");
	}

	public void mostrarDescripcion() {
	}
	
	public void mostrarPrecio() {
		System.out.print("Precio: $"+format.format(precio)+"\n");
	}
	
	
}

