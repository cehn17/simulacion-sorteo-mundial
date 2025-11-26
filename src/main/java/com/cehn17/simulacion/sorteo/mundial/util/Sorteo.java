package com.cehn17.simulacion.sorteo.mundial.util;

import java.util.Random;

import com.cehn17.simulacion.sorteo.mundial.entities.Bombo;
import com.cehn17.simulacion.sorteo.mundial.entities.BomboConRepechaje;
import com.cehn17.simulacion.sorteo.mundial.entities.Pais;
import com.cehn17.simulacion.sorteo.mundial.entities.Repechaje;
import com.cehn17.simulacion.sorteo.mundial.entities.Seleccion;

public class Sorteo {

	private Bombo bombo1 = Bombos.bombo1();
	private Bombo bombo2 = Bombos.bombo2();
	private Bombo bombo3 = Bombos.bombo3();
	private BomboConRepechaje bombo4 = Bombos.bombo4();
	
	public Seleccion mexico() {
		bombo1.getSelecciones().remove(new Seleccion(1L,new Pais(1L,"Mexico"),Confederaciones.confederaciones()[1]));
		return new Seleccion(1L,new Pais(1L,"Mexico"),Confederaciones.confederaciones()[1]);
	}
	
	public Seleccion usa() {
		bombo1.getSelecciones().remove(new Seleccion(2L,new Pais(2L,"Estados Unidos"),Confederaciones.confederaciones()[1]));
		return new Seleccion(2L,new Pais(2L,"Estados Unidos"),Confederaciones.confederaciones()[1]);
	}
	
	public Seleccion canada() {
		bombo1.getSelecciones().remove(new Seleccion(3L,new Pais(3L,"Canada"),Confederaciones.confederaciones()[1]));
		return new Seleccion(3L,new Pais(3L,"Canada"),Confederaciones.confederaciones()[1]);
	}
	
	
	public Seleccion sortearBombo1() {
		Random r = new Random();
		int n = r.nextInt(bombo1.getSelecciones().size());
		Seleccion sorteada = bombo1.getSelecciones().get(n);
		bombo1.getSelecciones().remove(sorteada);
		return sorteada;
	}
	
	public Seleccion sortearBombo2() {
		Random r = new Random();
		int n = r.nextInt(bombo2.getSelecciones().size());
		Seleccion sorteada = bombo2.getSelecciones().get(n);
		bombo2.getSelecciones().remove(sorteada);
		return sorteada;
	}
	public Seleccion sortearBombo3() {
		Random r = new Random();
		int n = r.nextInt(bombo3.getSelecciones().size());
		Seleccion sorteada = bombo3.getSelecciones().get(n);
		bombo3.getSelecciones().remove(sorteada);
		return sorteada;
	}
	
	public Seleccion sortearBombo4() {
		Random r = new Random();
		int n = r.nextInt(bombo4.getSelecciones().size());
		Seleccion sorteada = bombo4.getSelecciones().get(n);
		bombo4.getSelecciones().remove(sorteada);
		return sorteada;
	}
	
	public Repechaje sortearRepechaje4() {
		Random r = new Random();
		int n = r.nextInt(bombo4.getRepechajes().size());
		Repechaje repechaje = bombo4.getRepechajes().get(n);
		bombo4.getRepechajes().remove(repechaje);
		return repechaje;
	}

	public Bombo getBombo1() {
		return bombo1;
	}
	public Bombo getBombo2() {
		return bombo2;
	}
	public Bombo getBombo3() {
		return bombo3;
	}
	public BomboConRepechaje getBombo4() {
		return bombo4;
	}
}
