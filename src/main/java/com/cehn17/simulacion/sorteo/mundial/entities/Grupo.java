package com.cehn17.simulacion.sorteo.mundial.entities;

import java.util.LinkedList;
import java.util.List;

public class Grupo {
	
	private Long id;
	private String nombre;
	private char grupo;
	private LinkedList<Seleccion> selecciones;
	private Repechaje repechaje;
	private boolean forzado; //va a ser true para el primer europeo que salga
	
	public Grupo(Long id, char grupo) {
		this.id = id;
		this.grupo = grupo;
		this.nombre = "Grupo: "+ this.grupo;
		this.selecciones = new LinkedList<Seleccion>();
		this.repechaje = null;
		this.forzado = false;
	}

	public boolean isForzado() {
		return forzado;
	}

	public void setForzado(boolean forzado) {
		this.forzado = forzado;
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

	public char getGrupo() {
		return grupo;
	}

	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}

	public List<Seleccion> getSelecciones() {
		return selecciones;
	}

	public void agregarSeleccion(Seleccion s) {
		this.selecciones.addLast(s);
	}

	public Repechaje getRepechaje() {
		return repechaje;
	}

	public void setRepechaje(Repechaje repechaje) {
		this.repechaje = repechaje;
	}

	@Override
	public String toString() {
		return "Grupo = " + grupo + " Selecciones = " + selecciones +"]";
//				+ ", repechaje=" + repechaje + ", forzado=" + forzado + "]";
	}
	
	

	
}
