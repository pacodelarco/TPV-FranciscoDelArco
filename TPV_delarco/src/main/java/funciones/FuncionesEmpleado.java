package funciones;

import java.awt.image.BufferedImage;

public class FuncionesEmpleado {
	private String nombre;
	private String nombreUsuario;
	private String contraseña;
	private BufferedImage fotoUsuario;

	public void registrarUsuario(String nombre, String nombreUsuario, String contraseña, BufferedImage fotoUsuario) {
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.fotoUsuario = fotoUsuario;
	}
}
