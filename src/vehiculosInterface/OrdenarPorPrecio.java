package vehiculosInterface;
import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Vehiculos> { 
	
	
    public int compare(Vehiculos a, Vehiculos b) 
    { 
    	return a.precio > b.precio ? -1 :(a.precio < b.precio ? 1 : 0); 
    } 
} 

