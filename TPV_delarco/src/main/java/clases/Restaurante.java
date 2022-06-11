package clases;

public class Restaurante extends ElementoConNombre {

	private String cif = "12345678A";
	private String direccion = "C/ Las Huertas, 12";
	private int telefono = 952123123;
	private Carta carta;
	private Mesa[] mesa;

	public Restaurante(String nombre, Carta carta, Mesa[] mesa) {
		super(nombre="Restaurante Carola");
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
