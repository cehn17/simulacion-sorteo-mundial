package com.cehn17.simulacion.sorteo.mundial.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class BomboConRepechaje extends Bombo {
	
	private List<Repechaje> repechajes;
	
	public BomboConRepechaje(Long id, String nombre, List<Seleccion> lista) {
		super(id, nombre,lista);
		this.repechajes = new LinkedList<Repechaje>();
	}
	
	public void agregarRepechaje(Repechaje repechaje) {
		this.repechajes.add(repechaje);
	}
	
	

	public List<Repechaje> getRepechajes() {
		return repechajes;
	}

	public void setRepechajes(List<Repechaje> repechajes) {
		this.repechajes = repechajes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(repechajes);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BomboConRepechaje other = (BomboConRepechaje) obj;
		return Objects.equals(repechajes, other.repechajes);
	}

	@Override
	public String toString() {
		return "BomboConRepechaje [repechaje=" + repechajes + "]";
	}
	
}
