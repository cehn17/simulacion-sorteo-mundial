package com.cehn17.simulacion.sorteo.mundial.entities;

import java.util.List;
import java.util.Objects;

public class Repechaje {
	
	private Long id;
	private String nombre;
	private List<Seleccion> selecciones;
	
	public Repechaje(Long id, String nombre, List<Seleccion> selecciones) {
		this.id = id;
		this.nombre = nombre;
		this.selecciones = selecciones;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(selecciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Repechaje other = (Repechaje) obj;
		return Objects.equals(selecciones, other.selecciones);
	}

	

	@Override
	public String toString() {
		return "Repechaje [selecciones=" + selecciones + "]";
	}
	
	
	
}
