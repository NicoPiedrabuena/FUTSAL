package src;
import java.util.ArrayList;

public class Equipo {

	
	
	private String nombreEquipo;
	private ArrayList<Jugador> equipo;

	public Equipo (String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		equipo = new ArrayList<Jugador>();
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public ArrayList<Jugador> getEquipo() {
		return equipo;
	}

	public void setEquipo(ArrayList<Jugador> equipo) {
		this.equipo = equipo;
	}

	public void agregarJugador(Jugador jugador) {
		equipo.add(jugador);
		
	}

	public Integer edadPromedio() {
		Integer edadTotal = 0;
		for (Jugador jugador : equipo) {
			edadTotal += jugador.getEdad();
		}
		return edadTotal/equipo.size();
	}

	public Integer calcularValorTotalEquipo() {
		Integer valorTotal = 0;
		for (Jugador jugador : equipo) {
			valorTotal+= jugador.getPrecio();
		}
		return valorTotal;
	}
	
	
}
