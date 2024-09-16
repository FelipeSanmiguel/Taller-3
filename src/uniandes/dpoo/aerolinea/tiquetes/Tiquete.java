package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.*;

public class Tiquete {

	private String codigo;
	
	private int tarifa;
	
	private boolean usado;
	
	private Vuelo vuelo;
	
	private Cliente cliente;

	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.cliente = clienteComprador;
		this.tarifa = tarifa;
		
	}
	
	public String getCodigo() {
		return codigo;
	}

	public int getTarifa() {
		return tarifa;
	}

	public boolean isUsado() {
		return usado;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}
	
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void marcarComoUsado() {
		this.usado = true;
	}
	
}
