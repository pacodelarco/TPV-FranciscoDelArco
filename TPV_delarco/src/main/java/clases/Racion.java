package clases;

import java.awt.image.BufferedImage;

import enums.Tama�oRacion;

public class Racion extends ElementoCarta{
	private Tama�oRacion tama�o;

	public Racion(String nombre, float precio, BufferedImage foto, Tama�oRacion tama�o) {
		super(nombre, precio, foto);
		this.tama�o = tama�o;
	}

	public Tama�oRacion getTama�o() {
		return tama�o;
	}

	public void setTama�o(Tama�oRacion tama�o) {
		this.tama�o = tama�o;
	}

	
	

}
