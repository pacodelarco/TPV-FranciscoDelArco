package funciones;

import java.awt.image.BufferedImage;

public class FuncionesEmpleado {
	private String nombre;
	private String nombreUsuario;
	private String contraseņa;
	private BufferedImage fotoUsuario;

	public void registrarUsuario(String nombre, String nombreUsuario, String contraseņa, BufferedImage fotoUsuario) {
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.contraseņa = contraseņa;
		this.fotoUsuario = fotoUsuario;
	}
}
