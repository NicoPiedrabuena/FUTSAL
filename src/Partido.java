package src;
import java.util.ArrayList;

public class Partido {
	private String nombreYFecha;
	private Equipo local;
	private Equipo visitante;
	private ArrayList <Evento>eventos;
	
	
	public Partido(Equipo local, Equipo visitante, String nombreYFecha) {
		this.nombreYFecha = nombreYFecha;
		eventos = new ArrayList<Evento>();
	}


	public Object getNombre() {
		// TODO Auto-generated method stub
		return nombreYFecha;
	}


	public void registrarEvento(Evento evento) {
		eventos.add(evento);
		
	}


	@Override
	public String toString() {
		return "Partido = "+ nombreYFecha +"\n";
	}


	public ArrayList<Evento> getEventos() {
		return eventos;
	}


	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	public ArrayList<Evento> getGoles() {
		ArrayList<Evento> goles= new ArrayList<Evento>();
			for (Evento evento : eventos) {
				if(evento.getTipoEvento() == tipoEvento.GOL) {
					goles.add(evento);
				}
			}
		return goles;
		
	}
	public ArrayList<Evento> getAmonestados() {
		ArrayList<Evento> amonestados= new ArrayList<Evento>();
			for (Evento evento : eventos) {
				if(evento.getTipoEvento() == tipoEvento.AMONESTACION) {
					amonestados.add(evento);
				}
			}
		return amonestados;
		
	}
	public ArrayList<Evento> getExpulsados() {
		ArrayList<Evento> expulsados= new ArrayList<Evento>();
			for (Evento evento : eventos) {
				if(evento.getTipoEvento() == tipoEvento.EXPULSION) {
					expulsados.add(evento);
				}
			}
		return expulsados;
		
	}


	public String resumenDelPartido() {
		String resumen= "";
		String goles = "GOLES DEL PARTIDO " + "\n";
		String amonestados = "AMONESTADOS DEL PARTIDO " + "\n";
		String expulsados = "EXPULSADOS DEL PARTIDO " + "\n";
		
		resumen += toString();
		for (Evento evento : eventos) {
			if(evento.getTipoEvento() ==tipoEvento.GOL ) {
				
				goles += evento.toString();
			}
			if(evento.getTipoEvento() ==tipoEvento.AMONESTACION) {
				amonestados += evento.toString();
			}
			if(evento.getTipoEvento() ==tipoEvento.EXPULSION) {
				expulsados += evento.toString();
			}
		}
		return resumen+ goles + amonestados+expulsados;
		
	}
	
	


	

}
