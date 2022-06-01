package clases;

import java.util.TreeMap;

public class Carta {

	TreeMap<String, ElementoCarta> productos;

	public Carta(TreeMap<String, ElementoCarta> productos) {
		super();
		this.productos = productos;
	}

	public TreeMap<String, ElementoCarta> getProductos() {
		return productos;
	}

	public void setProductos(TreeMap<String, ElementoCarta> productos) {
		this.productos = productos;
	}


	
	
}
