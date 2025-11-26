package com.cehn17.simulacion.sorteo.mundial.entities;

import java.util.Objects;

public class Seleccion {
	
	private Long id;
	private Pais pais;
	private Confederacion confederacion;
	
	public Seleccion(Long id, Pais pais, Confederacion confederacion) {
		this.id = id;
		this.pais = pais;
		this.confederacion = confederacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Confederacion getConfederacion() {
		return confederacion;
	}

	public void setConfederacion(Confederacion confederacion) {
		this.confederacion = confederacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(confederacion, id, pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seleccion other = (Seleccion) obj;
		return Objects.equals(confederacion, other.confederacion) && Objects.equals(id, other.id)
				&& Objects.equals(pais, other.pais);
	}

	@Override
	public String toString() {
		return pais + ", " + confederacion;
	}
	
	

}
