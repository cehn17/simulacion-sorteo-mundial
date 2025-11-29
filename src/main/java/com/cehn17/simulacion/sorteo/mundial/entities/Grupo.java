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
	
	public boolean tieneConmebol() {
		if(this.selecciones.size() == 0)
			return false;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(new Confederacion(1L, "CONMEBOL"))) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean tieneConcacaf() {
		if(this.selecciones.size() == 0)
			return false;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(new Confederacion(2L, "CONCACAF"))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean tieneUEFA() {
		if(this.selecciones.size() == 0)
			return false;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(new Confederacion(3L, "UEFA"))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean tieneDosDeUEFA() {
		if(this.selecciones.size() == 0)
			return false;
		int cont = 0;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(new Confederacion(3L, "UEFA"))) {
				cont++;
			}
		}
		return cont == 2;
	}

	public boolean tieneAFC() {
		if(this.selecciones.size() == 0)
			return false;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(new Confederacion(4L, "AFC"))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean tieneCAF() {
		if(this.selecciones.size() == 0)
			return false;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(new Confederacion(5L, "CAF"))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean tieneOFC() {
		if(this.selecciones.size() == 0)
			return false;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(new Confederacion(6L, "OFC"))) {
				return true;
			}
		}
		return false;
	}

	public boolean tieneConfederacion(Confederacion confederacion) {
		if(this.selecciones.size() == 0)
			return false;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(confederacion) && !confederacion.equals(new Confederacion(3L, "UEFA"))) {
				return true;
			}
		}
		
		if(confederacion.equals(new Confederacion(3L, "UEFA")) && this.tieneDosDeUEFA()){
			return true;
		}
		
		return false;
	}
	
	public boolean tieneDosUefaYUnoCaf() {
		int contUefa = 0;
		int contCaf = 0;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(new Confederacion(3L, "UEFA"))){
				contUefa++;
			}
			if(seleccion.getConfederacion().equals(new Confederacion(5L, "CAF"))){
				contCaf++;
			}
		}
		return contUefa == 2 && contCaf == 1;
				
	}
	
	public boolean tieneUnoUefaYunoCAF() {
		int contUefa = 0;
		int contCaf = 0;
		for (Seleccion seleccion : selecciones) {
			if(seleccion.getConfederacion().equals(new Confederacion(3L, "UEFA"))){
				contUefa++;
			}
			if(seleccion.getConfederacion().equals(new Confederacion(5L, "CAF"))){
				contCaf++;
			}
		}
		return contUefa == 1 && contCaf == 1;
	}
	
}
