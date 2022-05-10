package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.Equipo;
import src.Evento;
import src.Jugador;
import src.Partido;
import src.localOVisitante;
import src.tipoEvento;

class testFutsal {

	@Test
	void queSePuedaCrearUnJugador() {
		Integer precio = 15000;
		String nombre ="Roberto Carlos";
		Integer edad = 25;
		
		
		Jugador numeroUno = new Jugador (nombre ,precio,edad);
		
		assertEquals(nombre, numeroUno.getNombre());
	}
	@Test
	void queSePuedaCrearUnEquipo() {
	String nombreEquipoLocal = "River";
	Equipo local = new Equipo (nombreEquipoLocal);
	
	assertEquals(nombreEquipoLocal ,local.getNombreEquipo());
	}
	@Test
	void queSePuedanAgregarJugadores() {
		Integer precio = 15000;
		String nombre ="Roberto Carlos";
		Integer edad = 25;
		
		Integer precio2 = 15000;
		String nombre2 ="Roberto Carlos";
		Integer edad2 = 25;
		
		Integer precio3 = 15000;
		String nombre3 ="Roberto Carlos";
		Integer edad3 = 25;
		
		Integer precio4 = 15000;
		String nombre4 ="Roberto Carlos";
		Integer edad4 = 25;
		
		Integer precio5 = 15000;
		String nombre5 ="Roberto Carlos";
		Integer edad5 = 25;
		
		
		String nombreEquipoLocal = "River";
		Equipo local = new Equipo (nombreEquipoLocal);
		
		Jugador numeroUno = new Jugador (nombre ,precio,edad);
		Jugador numeroDos = new Jugador (nombre2 ,precio2,edad2);
		Jugador numeroTres = new Jugador (nombre3 ,precio3,edad3);
		Jugador numeroCuatro = new Jugador (nombre4 ,precio4,edad4);
		Jugador numeroCinco = new Jugador (nombre5 ,precio5,edad5);
		
		local.agregarJugador(numeroUno);
		local.agregarJugador(numeroDos);
		local.agregarJugador(numeroTres);
		local.agregarJugador(numeroCuatro);
		local.agregarJugador(numeroCinco);

		assertEquals(5,local.getEquipo().size());
		
	}
	@Test
	void queSePuedaSaberEdadPromedio() {
		Integer precio = 15000;
		String nombre ="Roberto Carlos";
		Integer edad = 25;
		
		Integer precio2 = 15000;
		String nombre2 ="Roberto Carlos";
		Integer edad2 = 25;
		
		Integer precio3 = 15000;
		String nombre3 ="Roberto Carlos";
		Integer edad3 = 25;
		
		Integer precio4 = 15000;
		String nombre4 ="Roberto Carlos";
		Integer edad4 = 25;
		
		Integer precio5 = 15000;
		String nombre5 ="Roberto Carlos";
		Integer edad5 = 25;
		
		
		String nombreEquipoLocal = "River";
		Equipo local = new Equipo (nombreEquipoLocal);
		Integer edadPromedioEsperada = 25;
		
		Jugador numeroUno = new Jugador (nombre ,precio,edad);
		Jugador numeroDos = new Jugador (nombre2 ,precio2,edad2);
		Jugador numeroTres = new Jugador (nombre3 ,precio3,edad3);
		Jugador numeroCuatro = new Jugador (nombre4 ,precio4,edad4);
		Jugador numeroCinco = new Jugador (nombre5 ,precio5,edad5);
		local.agregarJugador(numeroUno);
		local.agregarJugador(numeroDos);
		local.agregarJugador(numeroTres);
		local.agregarJugador(numeroCuatro);
		local.agregarJugador(numeroCinco);
		
		assertEquals(edadPromedioEsperada,local.edadPromedio());
		
	}
	
	@Test 
	void queSePuedaSaberElValorTotalDelEquipo() {
		Integer precio = 15000;
		String nombre ="Roberto Carlos";
		Integer edad = 25;
		
		Integer precio2 = 15000;
		String nombre2 ="Roberto Carlos";
		Integer edad2 = 25;
		
		Integer precio3 = 15000;
		String nombre3 ="Roberto Carlos";
		Integer edad3 = 25;
		
		Integer precio4 = 15000;
		String nombre4 ="Roberto Carlos";
		Integer edad4 = 25;
		
		Integer precio5 = 15000;
		String nombre5 ="Roberto Carlos";
		Integer edad5 = 25;
		String nombreEquipoLocal = "River";
		Equipo local = new Equipo (nombreEquipoLocal);
		
		Integer valorTotalEquipoEsperado = 75000;
		
		Jugador numeroUno = new Jugador (nombre ,precio,edad);
		Jugador numeroDos = new Jugador (nombre2 ,precio2,edad2);
		Jugador numeroTres = new Jugador (nombre3 ,precio3,edad3);
		Jugador numeroCuatro = new Jugador (nombre4 ,precio4,edad4);
		Jugador numeroCinco = new Jugador (nombre5 ,precio5,edad5);
		local.agregarJugador(numeroUno);
		local.agregarJugador(numeroDos);
		local.agregarJugador(numeroTres);
		local.agregarJugador(numeroCuatro);
		local.agregarJugador(numeroCinco);
		
		assertEquals(valorTotalEquipoEsperado,local.calcularValorTotalEquipo());
	}
	@Test 
	void queSePuedaRegistrarUnPartido() {
		Integer precio = 15000;
		String nombre ="Roberto Carlos";
		Integer edad = 25;
		
		Integer precio2 = 15000;
		String nombre2 ="Roberto Carlos";
		Integer edad2 = 25;
		
		Integer precio3 = 15000;
		String nombre3 ="Roberto Carlos";
		Integer edad3 = 25;
		
		Integer precio4 = 15000;
		String nombre4 ="Roberto Carlos";
		Integer edad4 = 25;
		
		Integer precio5 = 15000;
		String nombre5 ="Roberto Carlos";
		Integer edad5 = 25;
		String nombreEquipoLocal = "River";
		Equipo local = new Equipo (nombreEquipoLocal);
		
		Jugador numeroUno = new Jugador (nombre ,precio,edad);
		Jugador numeroDos = new Jugador (nombre2 ,precio2,edad2);
		Jugador numeroTres = new Jugador (nombre3 ,precio3,edad3);
		Jugador numeroCuatro = new Jugador (nombre4 ,precio4,edad4);
		Jugador numeroCinco = new Jugador (nombre5 ,precio5,edad5);
		
		local.agregarJugador(numeroUno);
		local.agregarJugador(numeroDos);
		local.agregarJugador(numeroTres);
		local.agregarJugador(numeroCuatro);
		local.agregarJugador(numeroCinco);
		
		Integer preciov1 = 15000;
		String nombrev1 ="Roberto Carlos";
		Integer edadv1 = 25;
		
		Integer preciov2 = 15000;
		String nombrev2 ="Roberto Carlos";
		Integer edadv2 = 25;
		
		Integer preciov3 = 15000;
		String nombrev3 ="Roberto Carlos";
		Integer edadv3 = 25;
		
		Integer preciov4 = 15000;
		String nombrev4 ="Roberto Carlos";
		Integer edadv4 = 25;
		
		Integer preciov5 = 15000;
		String nombrev5 ="Roberto Carlos";
		Integer edadv5 = 25;
		String nombreEquipoVisitante = "Boca";
		Jugador numeroUnoV = new Jugador (nombre ,precio,edad);
		Jugador numeroDosV = new Jugador (nombre2 ,precio2,edad2);
		Jugador numeroTresV = new Jugador (nombre3 ,precio3,edad3);
		Jugador numeroCuatroV = new Jugador (nombre4 ,precio4,edad4);
		Jugador numeroCincoV = new Jugador (nombre5 ,precio5,edad5);
		
		
		Equipo visitante = new Equipo (nombreEquipoVisitante);
		visitante.agregarJugador(numeroUnoV);
		visitante.agregarJugador(numeroDosV);
		visitante.agregarJugador(numeroTresV);
		visitante.agregarJugador(numeroCuatroV);
		visitante.agregarJugador(numeroCincoV);
		
		String partidoNombreYNumero;
		
		Partido riverVsBoca = new Partido (local ,visitante,"river vs boca fecha 5" );
		
		String nombrePartidoEsperado = "river vs boca fecha 5";
		
		assertEquals(local.getEquipo().size(),visitante.getEquipo().size());
		assertEquals (nombrePartidoEsperado, riverVsBoca.getNombre());
	}
	@Test 
	void queSePuedaRegistrarUnEvento() {
		Integer precio = 15000;
		String nombre ="Roberto Carlos";
		Integer edad = 25;
		
		Integer precio2 = 15000;
		String nombre2 ="Roberto Carlos";
		Integer edad2 = 25;
		
		Integer precio3 = 15000;
		String nombre3 ="Roberto Carlos";
		Integer edad3 = 25;
		
		Integer precio4 = 15000;
		String nombre4 ="Roberto Carlos";
		Integer edad4 = 25;
		
		Integer precio5 = 15000;
		String nombre5 ="Roberto Carlos";
		Integer edad5 = 25;
		String nombreEquipoLocal = "River";
		Equipo local = new Equipo (nombreEquipoLocal);
		
		Jugador numeroUno = new Jugador (nombre ,precio,edad);
		Jugador numeroDos = new Jugador (nombre2 ,precio2,edad2);
		Jugador numeroTres = new Jugador (nombre3 ,precio3,edad3);
		Jugador numeroCuatro = new Jugador (nombre4 ,precio4,edad4);
		Jugador numeroCinco = new Jugador (nombre5 ,precio5,edad5);
		
		local.agregarJugador(numeroUno);
		local.agregarJugador(numeroDos);
		local.agregarJugador(numeroTres);
		local.agregarJugador(numeroCuatro);
		local.agregarJugador(numeroCinco);
		
		Integer preciov1 = 15000;
		String nombrev1 ="Roberto Carlos";
		Integer edadv1 = 25;
		
		Integer preciov2 = 15000;
		String nombrev2 ="Roberto Carlos";
		Integer edadv2 = 25;
		
		Integer preciov3 = 15000;
		String nombrev3 ="Roberto Carlos";
		Integer edadv3 = 25;
		
		Integer preciov4 = 15000;
		String nombrev4 ="Roberto Carlos";
		Integer edadv4 = 25;
		
		Integer preciov5 = 15000;
		String nombrev5 ="Roberto Carlos";
		Integer edadv5 = 25;
		String nombreEquipoVisitante = "Boca";
		Jugador numeroUnoV = new Jugador (nombre ,precio,edad);
		Jugador numeroDosV = new Jugador (nombre2 ,precio2,edad2);
		Jugador numeroTresV = new Jugador (nombre3 ,precio3,edad3);
		Jugador numeroCuatroV = new Jugador (nombre4 ,precio4,edad4);
		Jugador numeroCincoV = new Jugador (nombre5 ,precio5,edad5);
		
		
		Equipo visitante = new Equipo (nombreEquipoVisitante);
		visitante.agregarJugador(numeroUnoV);
		visitante.agregarJugador(numeroDosV);
		visitante.agregarJugador(numeroTresV);
		visitante.agregarJugador(numeroCuatroV);
		visitante.agregarJugador(numeroCincoV);
		
		String partidoNombreYNumero;
		String minutoDelGol = "23:45";
		Partido riverVsBoca = new Partido (local ,visitante,"river vs boca fecha 5" );
		
		String nombrePartidoEsperado = "river vs boca fecha 5";
		Evento gol = new Evento(nombrev1,minutoDelGol,tipoEvento.GOL, localOVisitante.LOCAL);
		String minutoDeAmonestacion = "41.20";
		Evento amonestado = new Evento(nombrev2,minutoDeAmonestacion ,tipoEvento.AMONESTACION, localOVisitante.VISITANTE);
		riverVsBoca.registrarEvento(gol);
		riverVsBoca.registrarEvento(amonestado);
		
		
		assertEquals(nombrev1, riverVsBoca.getEventos().get(0).getAutor());
		assertEquals(nombre, riverVsBoca.getEventos().get(1).getAutor());
	}
	@Test 
	void queSePuedaMostrarResumenDelPartido() {
		Integer precio = 15000;
		String nombre ="Roberto Carlos";
		Integer edad = 25;
		
		Integer precio2 = 15000;
		String nombre2 ="Roberto Carlos";
		Integer edad2 = 25;
		
		Integer precio3 = 15000;
		String nombre3 ="Roberto Carlos";
		Integer edad3 = 25;
		
		Integer precio4 = 15000;
		String nombre4 ="Roberto Carlos";
		Integer edad4 = 25;
		
		Integer precio5 = 15000;
		String nombre5 ="Roberto Carlos";
		Integer edad5 = 25;
		String nombreEquipoLocal = "River";
		Equipo local = new Equipo (nombreEquipoLocal);
		
		Jugador numeroUno = new Jugador (nombre ,precio,edad);
		Jugador numeroDos = new Jugador (nombre2 ,precio2,edad2);
		Jugador numeroTres = new Jugador (nombre3 ,precio3,edad3);
		Jugador numeroCuatro = new Jugador (nombre4 ,precio4,edad4);
		Jugador numeroCinco = new Jugador (nombre5 ,precio5,edad5);
		
		local.agregarJugador(numeroUno);
		local.agregarJugador(numeroDos);
		local.agregarJugador(numeroTres);
		local.agregarJugador(numeroCuatro);
		local.agregarJugador(numeroCinco);
		
		Integer preciov1 = 15000;
		String nombrev1 ="Roberto Carlos primero";
		Integer edadv1 = 25;
		
		Integer preciov2 = 15000;
		String nombrev2 ="Roberto Carlos";
		Integer edadv2 = 25;
		
		Integer preciov3 = 15000;
		String nombrev3 ="Roberto Carlos";
		Integer edadv3 = 25;
		
		Integer preciov4 = 15000;
		String nombrev4 ="Roberto Carlos";
		Integer edadv4 = 25;
		
		Integer preciov5 = 15000;
		String nombrev5 ="Roberto Carlos";
		Integer edadv5 = 25;
		String nombreEquipoVisitante = "Boca";
		Jugador numeroUnoV = new Jugador (nombre ,precio,edad);
		Jugador numeroDosV = new Jugador (nombre2 ,precio2,edad2);
		Jugador numeroTresV = new Jugador (nombre3 ,precio3,edad3);
		Jugador numeroCuatroV = new Jugador (nombre4 ,precio4,edad4);
		Jugador numeroCincoV = new Jugador (nombre5 ,precio5,edad5);
		
		
		Equipo visitante = new Equipo (nombreEquipoVisitante);
		visitante.agregarJugador(numeroUnoV);
		visitante.agregarJugador(numeroDosV);
		visitante.agregarJugador(numeroTresV);
		visitante.agregarJugador(numeroCuatroV);
		visitante.agregarJugador(numeroCincoV);
		
		String partidoNombreYNumero;
		String minutoDelGol = "23:45";
		Partido riverVsBoca = new Partido (local ,visitante,"river vs boca fecha 5" );
		String minutoDeAmonestacion = "41.20";
		String nombrePartidoEsperado = "river vs boca fecha 5";
		Evento gol = new Evento(nombrev1,minutoDelGol,tipoEvento.GOL, localOVisitante.LOCAL);
		
	Evento amonestado = new Evento(nombrev2,minutoDeAmonestacion ,tipoEvento.AMONESTACION, localOVisitante.VISITANTE);
		riverVsBoca.registrarEvento(gol);
		riverVsBoca.registrarEvento(amonestado);
		
		
	 
		System.out.println(riverVsBoca.resumenDelPartido());
	
	}
}

