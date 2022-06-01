package clases;

public class Mesa {

	private byte id;
	private Comanda comanda;
	public Mesa(byte id, Comanda comanda) {
		super();
		this.id = id;
		this.comanda = comanda;
	}
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public Comanda getComanda() {
		return comanda;
	}
	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}
	
	
	
}
