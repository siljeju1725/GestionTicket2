package com.net.gt.controladores;

import java.util.List;

import com.net.gt.modelos.Tickets;

public interface ContraladorTransacciones {
	
	public List<Tickets> obtenerDatos();
	
	public Tickets obtenerPersona(int id);
	
	public void insertar (Tickets p);
	
	public void actualizar (Tickets p);
	
	public void eliminar (int id);

}
