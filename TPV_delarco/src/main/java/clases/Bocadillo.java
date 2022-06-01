package clases;

import java.awt.image.BufferedImage;

import enums.Tama�oPan;

public class Bocadillo extends ElementoCarta{
	private Tama�oPan tama�o;

	public Bocadillo(String nombre, float precio, BufferedImage foto, Tama�oPan tama�o) {
		super(nombre, precio, foto);
		this.tama�o = tama�o;
	}

	public Tama�oPan getTama�o() {
		return tama�o;
	}

	public void setTama�o(Tama�oPan tama�o) {
		this.tama�o = tama�o;
	}

	


	
	
}
