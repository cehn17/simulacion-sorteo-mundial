package com.cehn17.simulacion.sorteo.mundial.entities;

import java.util.List;
import java.util.Objects;

public class Bombo {
	
	protected Long id;
	protected String nombre;
	protected List<Seleccion> selecciones;
	
	public Bombo(Long id, String nombre, List<Seleccion> selecciones) {
		this.id = id;
		this.nombre = nombre;
		this.selecciones = selecciones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Seleccion> getSelecciones() {
		return selecciones;
	}

//	public void setSelecciones(List<Seleccion> selecciones) {
//		this.selecciones = selecciones;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, selecciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bombo other = (Bombo) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(selecciones, other.selecciones);
	}

	@Override
	public String toString() {
		return "Bombo [id=" + id + ", nombre=" + nombre + ", selecciones=" + selecciones + "]";
	}
	
	
	
	
}
