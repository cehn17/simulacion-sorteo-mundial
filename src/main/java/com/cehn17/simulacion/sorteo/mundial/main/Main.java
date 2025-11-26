package com.cehn17.simulacion.sorteo.mundial.main;

import java.util.List;

import com.cehn17.simulacion.sorteo.mundial.entities.Confederacion;
import com.cehn17.simulacion.sorteo.mundial.entities.Grupo;
import com.cehn17.simulacion.sorteo.mundial.entities.Seleccion;
import com.cehn17.simulacion.sorteo.mundial.util.Sorteo;

public class Main {
	
	public static void main(String[] args) {
		
		Grupo[] grupos = new Grupo[12];
		char letra = 'A';
		for(int i = 0; i < 12; i++) {
			grupos[i] = new Grupo(i+1L, letra);
			letra++;
		}
		
		
		
		Sorteo sorteo = new Sorteo();
		
		grupos[0].agregarSeleccion(sorteo.mexico());
		grupos[1].agregarSeleccion(sorteo.usa());
		grupos[3].agregarSeleccion(sorteo.canada());
		
		
		
		
		

		while(sorteo.getBombo1().getSelecciones().size() != 0) {
			asignarGrupoBombo1(grupos, sorteo.sortearBombo1());
		}
		
		while(sorteo.getBombo2().getSelecciones().size() != 0) {
			Seleccion s = sorteo.sortearBombo2();
			asignarGrupoBombo2(grupos, s, sorteo.getBombo2().getSelecciones());
		}
		for (Grupo grupo : grupos) {
			System.out.println(grupo);
		}
		
 	}
	
	public static void asignarGrupoBombo1(Grupo[] grupos, Seleccion s) {
		for(Grupo g : grupos) {
			if(g.getSelecciones().size() == 0) {
				g.getSelecciones().add(s);
				return;
			}
		}
	}
	
	

	public static void asignarGrupoBombo2(Grupo[] grupos, Seleccion s, List<Seleccion> seleccionesBombo2) {
		//en grupos hay 2 de Conmebol, si grupos.getSelecciones().size() - cantConmebol == cantRestantesConmebol ==> busco grupo que no sea Conmebol
		//en bombo2 hay 3 de Conmebol --> sale 1 Conmebol en s
				
		int cantConmebolGrupos = cantPertenecenAconfederacion(grupos, new Confederacion(1L, "CONMEBOL"));
		int cantConmebolBombo2 = cantPertenecenAconfederacion(seleccionesBombo2, new Confederacion(1L, "CONMEBOL"));
		Confederacion c = new Confederacion(1L, "CONMEBOL");
		if(s.getConfederacion().equals(c)) {
			for(Grupo g : grupos) {
				
				if(g.getSelecciones().size() == 1 && !(g.getSelecciones().get(0).getConfederacion().equals(c))) {
					g.agregarSeleccion(s);
					return;
				}
			}
		}
		
		if(!s.getConfederacion().equals(c) && cantConmebolBombo2 > seleccionesBombo2.size()/2) {
			for(Grupo g : grupos) {
				
				if(g.getSelecciones().size() == 1 && g.getSelecciones().get(0).getConfederacion().equals(c)) {
					g.agregarSeleccion(s);
					return;
				}
			}
		}
		
		for(Grupo g : grupos) {
			
			if(g.getSelecciones().size() == 1 ) {
				
				g.agregarSeleccion(s);
				return;
			}
		}
	}
	
	public static int cantPertenecenAconfederacion(Grupo[] grupos , Confederacion confederacion) {
		int cont = 0;
		for (Grupo g : grupos) {
			if(g.getSelecciones().size() == 1 && g.getSelecciones().get(0).getConfederacion().equals(confederacion)) {
				cont++;
			}
		}
		return cont;
	}
	
	private static int cantPertenecenAconfederacion(List<Seleccion> selecciones, Confederacion confederacion) {
		int cont = 0;
		if(selecciones.size() > 0) {
			for (Seleccion seleccion : selecciones) {
				if(seleccion.getConfederacion().equals(confederacion)) {
					cont++;
				}
			}
		}
		
		return cont;
	}
}
