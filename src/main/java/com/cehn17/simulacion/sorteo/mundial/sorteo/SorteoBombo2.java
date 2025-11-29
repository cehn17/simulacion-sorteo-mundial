package com.cehn17.simulacion.sorteo.mundial.sorteo;

import java.util.List;

import com.cehn17.simulacion.sorteo.mundial.entities.Confederacion;
import com.cehn17.simulacion.sorteo.mundial.entities.Grupo;
import com.cehn17.simulacion.sorteo.mundial.entities.Seleccion;

public class SorteoBombo2 {

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
		
		if(seleccionesBombo2.size() <= 4 && cantConmebolGrupos >= cantConmebolBombo2 && !s.getConfederacion().equals(c)) {
			for(Grupo g : grupos) {
				
				if(g.getSelecciones().size() == 1 && g.getSelecciones().get(0).getConfederacion().equals(c)) {
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
