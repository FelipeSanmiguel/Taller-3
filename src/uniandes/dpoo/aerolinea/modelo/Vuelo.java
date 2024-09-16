package uniandes.dpoo.aerolinea.modelo;

import java.util.*;

public class Vuelo {

	public String fecha;
	
	public Avion avion;
	
	public Ruta ruta;
	
	public Vuelo(String fecha, Avion avion, Ruta ruta) {
		
		this.fecha = fecha;
		this.avion = avion;
		this.ruta = ruta;
		
	}

	public String getFecha() {
		return fecha;
	}

	public Avion getAvion() {
		return avion;
	}

	public Ruta getRuta() {
		return ruta;
	}
	
	public boolean  equals(Object obj) {
		return false;
	}
	
}
