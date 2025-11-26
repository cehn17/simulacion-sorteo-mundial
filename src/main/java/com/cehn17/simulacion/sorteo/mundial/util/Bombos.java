package com.cehn17.simulacion.sorteo.mundial.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.cehn17.simulacion.sorteo.mundial.entities.Bombo;
import com.cehn17.simulacion.sorteo.mundial.entities.BomboConRepechaje;
import com.cehn17.simulacion.sorteo.mundial.entities.Pais;
import com.cehn17.simulacion.sorteo.mundial.entities.Repechaje;
import com.cehn17.simulacion.sorteo.mundial.entities.Seleccion;

public class Bombos {
	
	public static Bombo bombo1() {
		List<Seleccion> selecciones = new LinkedList<>();
		selecciones.add(new Seleccion(1L,new Pais(1L,"Mexico"),Confederaciones.confederaciones()[1]));
		selecciones.add(new Seleccion(2L,new Pais(2L,"Estados Unidos"),Confederaciones.confederaciones()[1]));
		selecciones.add(new Seleccion(3L,new Pais(3L,"Canada"),Confederaciones.confederaciones()[1]));
		selecciones.add(new Seleccion(4L,new Pais(4L,"Argentina"),Confederaciones.confederaciones()[0]));
		selecciones.add(new Seleccion(5L,new Pais(5L,"Brasil"),Confederaciones.confederaciones()[0]));
		selecciones.add(new Seleccion(6L,new Pais(6L,"España"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(7L,new Pais(7L,"Inglaterra"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(8L,new Pais(8L,"Portugal"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(9L,new Pais(9L,"Holanda"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(10L,new Pais(10L,"Alemania"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(11L,new Pais(11L,"Francia"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(12L,new Pais(12L,"Belgica"),Confederaciones.confederaciones()[2]));
		
		Bombo bombo1 = new Bombo(1L, "Bombo 1",selecciones);
		return bombo1;
	}
	
	public static Bombo bombo2() {
		List<Seleccion> selecciones = new LinkedList<>();
		selecciones.add(new Seleccion(13L,new Pais(13L,"Croacia"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(14L,new Pais(14L,"Marruecos"),Confederaciones.confederaciones()[4]));
		selecciones.add(new Seleccion(15L,new Pais(15L,"Colombia"),Confederaciones.confederaciones()[0]));
		selecciones.add(new Seleccion(16L,new Pais(16L,"Uruguay"),Confederaciones.confederaciones()[0]));
		selecciones.add(new Seleccion(17L,new Pais(17L,"Senegal"),Confederaciones.confederaciones()[4]));
		selecciones.add(new Seleccion(18L,new Pais(18L,"Suiza"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(19L,new Pais(19L,"Japón"),Confederaciones.confederaciones()[3]));
		selecciones.add(new Seleccion(20L,new Pais(20L,"Irán"),Confederaciones.confederaciones()[3]));
		selecciones.add(new Seleccion(21L,new Pais(21L,"Corea del Sur"),Confederaciones.confederaciones()[3]));
		selecciones.add(new Seleccion(22L,new Pais(22L,"Ecuador"),Confederaciones.confederaciones()[0]));
		selecciones.add(new Seleccion(23L,new Pais(23L,"Austria"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(24L,new Pais(24L,"Australia"),Confederaciones.confederaciones()[3]));
		
		Bombo bombo2 = new Bombo(2L, "Bombo 2",selecciones);
		return bombo2;
	}
	
	public static Bombo bombo3() {
		List<Seleccion> selecciones = new LinkedList<>();
		selecciones.add(new Seleccion(25L,new Pais(25L,"Noruega"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(26L,new Pais(26L,"Panamá"),Confederaciones.confederaciones()[1]));
		selecciones.add(new Seleccion(27L,new Pais(27L,"Egipto"),Confederaciones.confederaciones()[4]));
		selecciones.add(new Seleccion(28L,new Pais(28L,"Argelia"),Confederaciones.confederaciones()[4]));
		selecciones.add(new Seleccion(29L,new Pais(29L,"Paraguay"),Confederaciones.confederaciones()[0]));
		selecciones.add(new Seleccion(30L,new Pais(30L,"Escocia"),Confederaciones.confederaciones()[2]));
		selecciones.add(new Seleccion(31L,new Pais(31L,"Túnez"),Confederaciones.confederaciones()[4]));
		selecciones.add(new Seleccion(32L,new Pais(32L,"Costa de Marfil"),Confederaciones.confederaciones()[4]));
		selecciones.add(new Seleccion(33L,new Pais(33L,"Uzbekistán"),Confederaciones.confederaciones()[3]));
		selecciones.add(new Seleccion(34L,new Pais(34L,"Qatar"),Confederaciones.confederaciones()[3]));
		selecciones.add(new Seleccion(35L,new Pais(35L,"Arabia Saudita"),Confederaciones.confederaciones()[3]));
		selecciones.add(new Seleccion(36L,new Pais(36L,"Sudáfrica"),Confederaciones.confederaciones()[4]));
	
		Bombo bombo2 = new Bombo(2L, "Bombo 2",selecciones);
		return bombo2;
	}
	
	public static BomboConRepechaje bombo4() {
		List<Seleccion> selecciones = new LinkedList<>();
		selecciones.add(new Seleccion(37L,new Pais(37L,"Jordania"),Confederaciones.confederaciones()[3]));
		selecciones.add(new Seleccion(38L,new Pais(38L,"Cabo Verde"),Confederaciones.confederaciones()[4]));
		selecciones.add(new Seleccion(39L,new Pais(39L,"Ghana"),Confederaciones.confederaciones()[4]));
		selecciones.add(new Seleccion(40L,new Pais(40L,"Curazao"),Confederaciones.confederaciones()[1]));
		selecciones.add(new Seleccion(41L,new Pais(41L,"Haití"),Confederaciones.confederaciones()[1]));
		selecciones.add(new Seleccion(42L,new Pais(42L,"Nueva Zelanda"),Confederaciones.confederaciones()[5]));
		
		List<Seleccion> europa1 = new LinkedList<>();
		europa1.add(new Seleccion(43L,new Pais(43L,"Italia"),Confederaciones.confederaciones()[2]));
		europa1.add(new Seleccion(44L,new Pais(44L,"Irlanda del Norte"),Confederaciones.confederaciones()[2]));
		europa1.add(new Seleccion(45L,new Pais(45L,"Gales"),Confederaciones.confederaciones()[2]));
		europa1.add(new Seleccion(46L,new Pais(46L,"Bosnia y Herzegovina"),Confederaciones.confederaciones()[2]));
		Repechaje repecahaje1 = new Repechaje(1L,"Europa 1", europa1);
		
		List<Seleccion> europa2 = new LinkedList<>();
		europa2.add(new Seleccion(47L,new Pais(47L,"Ucrania"),Confederaciones.confederaciones()[2]));
		europa2.add(new Seleccion(48L,new Pais(48L,"Suecia"),Confederaciones.confederaciones()[2]));
		europa2.add(new Seleccion(49L,new Pais(49L,"Polonia"),Confederaciones.confederaciones()[2]));
		europa2.add(new Seleccion(50L,new Pais(50L,"Albania"),Confederaciones.confederaciones()[2]));
		Repechaje repecahaje2 = new Repechaje(2L,"Europa 2", europa2);
		
		List<Seleccion> europa3 = new LinkedList<>();
		europa3.add(new Seleccion(51L,new Pais(51L,"Turquia"),Confederaciones.confederaciones()[2]));
		europa3.add(new Seleccion(52L,new Pais(52L,"Rumania"),Confederaciones.confederaciones()[2]));
		europa3.add(new Seleccion(53L,new Pais(53L,"Eslovaquia"),Confederaciones.confederaciones()[2]));
		europa3.add(new Seleccion(54L,new Pais(54L,"Kosovo"),Confederaciones.confederaciones()[2]));
		Repechaje repecahaje3 = new Repechaje(3L,"Europa 3", europa3);
		
		List<Seleccion> europa4 = new LinkedList<>();
		europa4.add(new Seleccion(55L,new Pais(55L,"Dinamarca"),Confederaciones.confederaciones()[2]));
		europa4.add(new Seleccion(56L,new Pais(56L,"Macedonia del Norte"),Confederaciones.confederaciones()[2]));
		europa4.add(new Seleccion(57L,new Pais(57L,"Republica Checa"),Confederaciones.confederaciones()[2]));
		europa4.add(new Seleccion(58L,new Pais(58L,"Republica de Irlanda"),Confederaciones.confederaciones()[2]));
		Repechaje repecahaje4 = new Repechaje(4L,"Europa 4", europa4);
		
		List<Seleccion> internacional1 = new LinkedList<>();
		internacional1.add(new Seleccion(59L,new Pais(59L,"RD Congo"),Confederaciones.confederaciones()[4]));
		internacional1.add(new Seleccion(60L,new Pais(60L,"Jamaica"),Confederaciones.confederaciones()[1]));
		internacional1.add(new Seleccion(61L,new Pais(61L,"Nueva Caledonia"),Confederaciones.confederaciones()[5]));
		Repechaje repecahaje5 = new Repechaje(5L,"Internacional 1", internacional1);
		
		List<Seleccion> internacional2 = new LinkedList<>();
		internacional2.add(new Seleccion(62L,new Pais(62L,"Irak"),Confederaciones.confederaciones()[3]));
		internacional2.add(new Seleccion(63L,new Pais(63L,"Surinam"),Confederaciones.confederaciones()[1]));
		internacional2.add(new Seleccion(64L,new Pais(64L,"Bolivia"),Confederaciones.confederaciones()[0]));
		Repechaje repecahaje6 = new Repechaje(6L,"Internacional 2", internacional2);
		
		BomboConRepechaje bombo4 = new BomboConRepechaje(4L, "Bombo 4", selecciones);
		bombo4.agregarRepechaje(repecahaje1);
		bombo4.agregarRepechaje(repecahaje2);
		bombo4.agregarRepechaje(repecahaje3);
		bombo4.agregarRepechaje(repecahaje4);
		bombo4.agregarRepechaje(repecahaje5);
		bombo4.agregarRepechaje(repecahaje6);
		
		return bombo4;
	}

}
