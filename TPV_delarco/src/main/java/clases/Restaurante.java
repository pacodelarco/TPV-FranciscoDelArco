package clases;

public class Restaurante extends ElementoConNombre {

	private String cif;
	private String direccion;
	private int telefono;
	private Carta carta;
	private Mesa[] mesa;

	public Restaurante(String nombre, String cif, String direccion, int telefono, Carta carta, Mesa[] mesa) {
		super(nombre);
		this.cif = cif;
		this.direccion = direccion;
		this.telefono = telefono;
		this.carta = carta;
		this.mesa = mesa;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public Mesa[] getMesa() {
		return mesa;
	}

	public void setMesa(Mesa[] mesa) {
		this.mesa = mesa;
	}

	
}
