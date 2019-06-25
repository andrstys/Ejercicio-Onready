package main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import vehiculosInterface.Vehiculos;
import vehiculosInterface.Autos;
import vehiculosInterface.Motos;
import vehiculosInterface.OrdenarPorPrecio;

public class Main{
	
	public static ArrayList<Vehiculos> items = new ArrayList<Vehiculos>();
	
	public static void main(String[] args) {
		
		String vehiculoY="";
		double vehiculoYPrecio=0;
		DecimalFormat format = new DecimalFormat("###,###.00");
		
		Vehiculos peugeot = new Autos("Peugeot","206",4,200000);
		Vehiculos peugeotNext = new Autos("Peugeot","208",5,250000);
		Vehiculos titan = new Motos("Honda","Titan","125c",60000);
		Vehiculos ybr = new Motos("Yamaha","YBR","160c",80500.50);

		items.add(peugeot);
		items.add(titan);
		items.add(peugeotNext);
		items.add(ybr);
		
		for (Vehiculos item : items) {
			item.mostrarMarca();
			item.mostrarModelo();
			item.mostrarDescripcion();
			item.mostrarPrecio();
		}
			
		Collections.sort(items, new OrdenarPorPrecio());
		
		String vehiculoCaro = items.get(0).getMarca()+" "+items.get(0).getModelo();
		String vehiculoBarato = items.get(3).getMarca()+" "+items.get(3).getModelo();
		
		for (Vehiculos item : items) {
	        if(item.getModelo() != null && item.getModelo().contains("Y")) {
	        	vehiculoY = item.getMarca()+" "+item.getModelo();
	        	vehiculoYPrecio = item.getPrecio();
	        	}   	
			}
				
		System.out.println("====================================\n"
				+ "Veh�culo m�s caro: "+vehiculoCaro+"\n"
				+ "Veh�culo m�s barato: "+vehiculoBarato+"\n"
				+ "Veh�culo que contiene en el modelo la letra 'Y': "+vehiculoY+" $"+format.format(vehiculoYPrecio));
				
		System.out.println("====================================\n"
				+ "Veh�culos ordenados por precio de mayor a menor:");
			for(Vehiculos item : items) {
				System.out.println(item.getMarca()+" "+item.getModelo());
			}
	
	}

}
