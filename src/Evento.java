package src;

public class Evento {
	
	private String minuto;
	private String autor;
	private tipoEvento tipoEvento;
	private localOVisitante localOVisitante;
	

	public Evento (String autor, String minuto , tipoEvento evento ,localOVisitante localOVisitante) {
		this.autor = autor;
		this.minuto = minuto;
		this.tipoEvento = evento;
		this.localOVisitante = localOVisitante;
	}

	public localOVisitante getLocalOVisitante() {
		return localOVisitante;
	}

	public void setLocalOVisitante(localOVisitante localOVisitante) {
		this.localOVisitante = localOVisitante;
	}

	public String getMinuto() {
		return minuto;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public tipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(tipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	@Override
	public String toString() {
		return "el autor " + getAutor() + " en el minuto "+ getMinuto() + "\n";
		
	}

	
	
	
	
}
