package com.cehn17.simulacion.sorteo.mundial.main;

import com.cehn17.simulacion.sorteo.mundial.entities.Grupo;
import com.cehn17.simulacion.sorteo.mundial.entities.Seleccion;
import com.cehn17.simulacion.sorteo.mundial.sorteo.SorteoBombo1;
import com.cehn17.simulacion.sorteo.mundial.sorteo.SorteoBombo2;
import com.cehn17.simulacion.sorteo.mundial.sorteo.SorteoBombo3;
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
			SorteoBombo1.asignarGrupoBombo1(grupos, sorteo.sortearBombo1());
		}
		
		while(sorteo.getBombo2().getSelecciones().size() != 0) {
			Seleccion s = sorteo.sortearBombo2();
			SorteoBombo2.asignarGrupoBombo2(grupos, s, sorteo.getBombo2().getSelecciones());
		}
		
		
		while(sorteo.getBombo3().getSelecciones().size() != 0) {
			Seleccion s = sorteo.sortearBombo3();
			SorteoBombo3.asignarGrupoBombo3(grupos, s, sorteo.getBombo3().getSelecciones());
		}
		
		
		
		for (Grupo grupo : grupos) {
			System.out.println(grupo);
		}
		
		System.out.println(sorteo.getBombo3().getSelecciones());
 	}
	
	
	
	
	


	
	
	
	
	
}
