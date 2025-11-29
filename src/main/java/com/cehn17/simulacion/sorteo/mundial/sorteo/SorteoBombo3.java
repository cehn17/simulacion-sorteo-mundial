package com.cehn17.simulacion.sorteo.mundial.sorteo;

import java.util.List;

import com.cehn17.simulacion.sorteo.mundial.entities.Confederacion;
import com.cehn17.simulacion.sorteo.mundial.entities.Grupo;
import com.cehn17.simulacion.sorteo.mundial.entities.Pais;
import com.cehn17.simulacion.sorteo.mundial.entities.Seleccion;
import com.cehn17.simulacion.sorteo.mundial.util.Confederaciones;

public class SorteoBombo3 {
	public static void asignarGrupoBombo3(Grupo[] grupos, Seleccion s, List<Seleccion> seleccionesBombo3) {
		
		if(!hayAlgunoConDosUefaYUnoCAF(grupos) && s.getConfederacion().equals(new Confederacion(5L, "CAF"))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && g.tieneDosDeUEFA()) {
					g.getSelecciones().add(s);
					System.out.println("Entro");
					return;
				}
			}
		}
		
		if(!hayAlgunoConDosUefaYUnoCAF(grupos) && s.getConfederacion().equals(new Confederacion(3L, "UEFA"))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && g.tieneUnoUefaYunoCAF()) {
					g.getSelecciones().add(s);
					System.out.println("Entro");
					return;
				}
			}
		}


		if (s.equals(new Seleccion(29L, new Pais(29L, "Paraguay"), Confederaciones.confederaciones()[0]))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && !g.tieneConmebol()) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}

		int cantConmebol = cantidadDeConmebol(grupos);
		if (seleccionesBombo3.size() <= cantConmebol+1
				&& !s.equals(new Seleccion(29L, new Pais(29L, "Paraguay"), Confederaciones.confederaciones()[0]))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && g.tieneConmebol()
						&& !g.tieneConfederacion(s.getConfederacion())) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}

		if (s.equals(new Seleccion(26L, new Pais(26L, "Panamá"), Confederaciones.confederaciones()[1]))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && !g.tieneConcacaf()) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}
		
		int cantConCacaf = cantidadDeConcacaf(grupos);
		if (seleccionesBombo3.size() <= cantConCacaf+1
				&& !s.equals(new Seleccion(26L, new Pais(26L, "Panamá"), Confederaciones.confederaciones()[1]))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && g.tieneConcacaf()
						&& !g.tieneConfederacion(s.getConfederacion())) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}
		
		int cantConDosUefa= cantidadDeDosConUEFA(grupos);
		if (seleccionesBombo3.size() <= cantConDosUefa+1
				&& !s.getConfederacion().equals(new Confederacion(3L, "UEFA"))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && g.tieneDosDeUEFA()
						&& !g.tieneConfederacion(s.getConfederacion())) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}

		if (s.getConfederacion().equals(new Confederacion(3L, "UEFA"))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && !g.tieneDosDeUEFA()) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}
		
		int cantConAFC = cantidadConAFC(grupos);
		if (seleccionesBombo3.size() <= cantConAFC+1
				&& !s.getConfederacion().equals(new Confederacion(4L, "AFC"))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && g.tieneAFC()
						&& !g.tieneConfederacion(s.getConfederacion())) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}

		if (s.getConfederacion().equals(new Confederacion(4L, "AFC"))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && !g.tieneAFC()) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}
		
		int cantConCAF = cantidadConCAF(grupos);
		if (seleccionesBombo3.size() <= cantConCAF+1
				&& !s.getConfederacion().equals(new Confederacion(5L, "CAF"))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && g.tieneCAF()
						&& !g.tieneConfederacion(s.getConfederacion())) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}

		if (s.getConfederacion().equals(new Confederacion(5L, "CAF"))) {
			for (Grupo g : grupos) {
				if (g.getSelecciones().size() == 2 && !g.tieneCAF()) {
					g.getSelecciones().add(s);
					return;
				}
			}
		}

		for(Grupo g : grupos) {
			if(g.getSelecciones().size() == 2) {
				g.getSelecciones().add(s);
				return;
			}
		}
	}


	private static int cantidadUEFA(List<Seleccion> seleccionesBombo3) {
		int cant = 0;
		for (Seleccion seleccion : seleccionesBombo3) {
			if(seleccion.getConfederacion().equals(new Confederacion(3L, "UEFA"))) {
				cant++;
			}
		}
		return cant;
	}


	private static int cantidadCAF(List<Seleccion> seleccionesBombo3) {
		int cant = 0;
		for (Seleccion seleccion : seleccionesBombo3) {
			if(seleccion.getConfederacion().equals(new Confederacion(5L, "CAF"))) {
				cant++;
			}
		}
		return cant;
	}


	private static int cantidadDeConmebol(Grupo[] grupos) {
		int cant = 0;
		for(Grupo g : grupos) {
			if(g.getSelecciones().size() == 2 && g.tieneConmebol()) {
				cant++;
			}
		}
		return cant;
	}
	
	private static int cantidadDeConcacaf(Grupo[] grupos) {
		int cant = 0;
		for(Grupo g : grupos) {
			if(g.getSelecciones().size() == 2 && g.tieneConcacaf()) {
				cant++;
			}
		}
		return cant;
	}
	
	private static int cantidadDeDosConUEFA(Grupo[] grupos) {
		int cant = 0;
		for(Grupo g : grupos) {
			if(g.getSelecciones().size() == 2 && g.tieneDosDeUEFA()) {
				cant++;
			}
		}
		return cant;
	}
	
	private static int cantidadConAFC(Grupo[] grupos) {
		int cant = 0;
		for(Grupo g : grupos) {
			if(g.getSelecciones().size() == 2 && g.tieneAFC()) {
				cant++;
			}
		}
		return cant;
	}
	
	private static int cantidadConCAF(Grupo[] grupos) {
		int cant = 0;
		for(Grupo g : grupos) {
			if(g.getSelecciones().size() == 2 && g.tieneCAF()) {
				cant++;
			}
		}
		return cant;
	}
	
	private static boolean hayAlgunoConDosUefaYUnoCAF(Grupo[] grupos) {
		for (Grupo grupo : grupos) {
			if(grupo.tieneDosUefaYUnoCaf()) {
				return true;
			}
		}
		return false;
	}
	
}
