package com.cehn17.simulacion.sorteo.mundial.sorteo;

import com.cehn17.simulacion.sorteo.mundial.entities.Grupo;
import com.cehn17.simulacion.sorteo.mundial.entities.Seleccion;

public class SorteoBombo1 {
	
	public static void asignarGrupoBombo1(Grupo[] grupos, Seleccion s) {
		for(Grupo g : grupos) {
			if(g.getSelecciones().size() == 0) {
				g.getSelecciones().add(s);
				return;
			}
		}
	}

}
