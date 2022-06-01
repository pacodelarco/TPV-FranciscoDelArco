package clases;

import java.awt.image.BufferedImage;

public class Bebida extends ElementoCarta{

	private boolean alcoholica;

	public Bebida(String nombre, float precio, BufferedImage foto, boolean alcoholica) {
		super(nombre, precio, foto);
		this.alcoholica = alcoholica;
	}

	public boolean isAlcoholica() {
		return alcoholica;
	}

	public void setAlcoholica(boolean alcoholica) {
		this.alcoholica = alcoholica;
	}

	
	
}
