package funciones;

import java.awt.image.BufferedImage;

public class FuncionesEmpleado {
	private String nombre;
	private String nombreUsuario;
	private String contrase�a;
	private BufferedImage fotoUsuario;

	public void registrarUsuario(String nombre, String nombreUsuario, String contrase�a, BufferedImage fotoUsuario) {
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.contrase�a = contrase�a;
		this.fotoUsuario = fotoUsuario;
	}
}
