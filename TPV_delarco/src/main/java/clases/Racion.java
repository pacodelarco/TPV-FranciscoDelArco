package clases;

import java.awt.image.BufferedImage;

import enums.TamañoRacion;

public class Racion extends ElementoCarta{
	private TamañoRacion tamaño;

	public Racion(String nombre, float precio, BufferedImage foto, TamañoRacion tamaño) {
		super(nombre, precio, foto);
		this.tamaño = tamaño;
	}

	public TamañoRacion getTamaño() {
		return tamaño;
	}

	public void setTamaño(TamañoRacion tamaño) {
		this.tamaño = tamaño;
	}

	
	

}
