package clases;

import java.awt.image.BufferedImage;

import enums.TamañoPan;

public class Bocadillo extends ElementoCarta{
	private TamañoPan tamaño;

	public Bocadillo(String nombre, float precio, BufferedImage foto, TamañoPan tamaño) {
		super(nombre, precio, foto);
		this.tamaño = tamaño;
	}

	public TamañoPan getTamaño() {
		return tamaño;
	}

	public void setTamaño(TamañoPan tamaño) {
		this.tamaño = tamaño;
	}

	


	
	
}
