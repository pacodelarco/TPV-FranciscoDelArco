package clases;

import java.awt.image.BufferedImage;

/**
 * clase de la que extenderan todos los elementos de la carta
 * 
 * @author fdelarco DAW
 *
 */
public class ElementoCarta extends ElementoConNombre{


	protected static float precio;
	protected static BufferedImage foto;
	
	
	public ElementoCarta(String nombre, float precio,BufferedImage foto) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}


	public static float getPrecio() {
		return precio;
	}


	public static void setPrecio(float precio) {
		ElementoCarta.precio = precio;
	}


	public static BufferedImage getFoto() {
		return foto;
	}


	public static void setFoto(BufferedImage foto) {
		ElementoCarta.foto = foto;
	}
	
}
