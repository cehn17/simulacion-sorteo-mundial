package com.cehn17.simulacion.sorteo.mundial.util;

import com.cehn17.simulacion.sorteo.mundial.entities.Confederacion;

public class Confederaciones {
	public static Confederacion[] confederaciones() {
		Confederacion[] confederaciones = new Confederacion[6];
		confederaciones[0] = new Confederacion(1L, "CONMEBOL");
		confederaciones[1] = new Confederacion(2L, "CONCACAF");
		confederaciones[2] = new Confederacion(3L, "UEFA");
		confederaciones[3] = new Confederacion(4L, "AFC"); //Asia
		confederaciones[4] = new Confederacion(5L, "CAF"); //AFRICA
		confederaciones[5] = new Confederacion(6L, "OFC");
		
		return confederaciones;
	}
}
