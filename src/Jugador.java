package src;

public class Jugador {

	private String nombre;
	private Integer precio;
	private Integer edad;

	public Jugador(String nombre, Integer precio, Integer edad) {
		this.nombre = nombre;
		this.precio = precio;
		this.edad = edad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
