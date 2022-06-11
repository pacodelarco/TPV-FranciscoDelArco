package clases;

import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import excepciones.ContrasegnaIncorrectaException;
import excepciones.ContrasegnaInvalidaException;
import excepciones.UsuarioNoExisteException;
import utils.ConexionBD;

public class Empleado extends ElementoConNombre {

	private String nombreUsuario;
	private String contrase�a;
	private BufferedImage fotoUsuario;
	

	public Empleado(String nombre, String nombreUsuario, String contrase�a, BufferedImage fotoUsuario)
			throws SQLException, ContrasegnaInvalidaException {

		super(nombre);

		if (!isValidPass(contrase�a)) {
			throw new ContrasegnaInvalidaException("La contrase�a debe tener al menos 3 caracteres");
		}
		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("INSERT INTO Empleado VALUES('" + nombre + "','" + nombreUsuario + "','" + contrase�a
				+ "','" + fotoUsuario + ")") > 0) {
			// Solo si todo ha ido bien insertando, se modifican las variables internas
			this.nombreUsuario = nombreUsuario;
			this.contrase�a = contrase�a;
			this.fotoUsuario = fotoUsuario;
			
		} else {
			ConexionBD.desconectar();
			throw new SQLException("Hubo un fallo al insertar los datos");
		}
		ConexionBD.desconectar();

	}

	public Empleado(String nombre, String nombreUsuario, String contrase�a ) throws SQLException,
			ContrasegnaIncorrectaException, UsuarioNoExisteException, ContrasegnaInvalidaException {
		super(nombre);

		if (!isValidPass(contrase�a)) {
			throw new ContrasegnaInvalidaException("La contrase�a debe tener al menos 3 caracteres");
		}

		Statement smt = ConexionBD.conectar();
		ResultSet cursor = smt.executeQuery("SELECT * FROM empleado WHERE nombreUsuario='" + nombreUsuario + "'");

		if (cursor.next()) {
			this.contrase�a = cursor.getString("contrase�a");
			if (!this.contrase�a.equals(contrase�a)) {
				ConexionBD.desconectar();
				throw new ContrasegnaIncorrectaException("La contrase�a no es correcta");
			}
			this.nombreUsuario = nombreUsuario;
		} else {
			ConexionBD.desconectar();
			throw new UsuarioNoExisteException("El usuario no existe o no se encuentra");
		}
		ConexionBD.desconectar();

	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) throws SQLException {
		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("UPDATE empleado SET nombreUsuario='" + nombreUsuario + "' WHERE nombreUsuario='"
				+ this.nombreUsuario + "'") > 0) {
			this.nombreUsuario = nombreUsuario;
		} else {
			ConexionBD.desconectar();
			throw new SQLException("No se ha podido cambiar el nombre de usuario");
		}
		ConexionBD.desconectar();
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public static boolean isValidPass(String contrase�a) {
		try {
			if (contrase�a.length() < 3) {
				return false;
			} else {
				return true;
			}
		} catch (NullPointerException e) {
			return false;
		}

	}

	public void setContrase�a(String contrase�a) throws SQLException, ContrasegnaInvalidaException {

		if (!isValidPass(contrase�a)) {
			throw new ContrasegnaInvalidaException("La contrase�a debe tener al menos 3 caracteres");
		}

		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("UPDATE empleado SET contrase�a='" + contrase�a + "' WHERE nombreUsuario='"
				+ this.nombreUsuario + "'") > 0) {
			this.contrase�a = contrase�a;
		} else {
			ConexionBD.desconectar();
			throw new SQLException("No se ha podido cambiar el nombre de usuario");
		}
		ConexionBD.desconectar();
	}

	public BufferedImage getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(BufferedImage fotoUsuario) throws SQLException {
		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("UPDATE empleado SET fotoUsuario='" + fotoUsuario + "' WHERE nombreUsuario='"
				+ this.nombreUsuario + "'") > 0) {
			this.fotoUsuario = fotoUsuario;
		} else {
			ConexionBD.desconectar();
			throw new SQLException("No se ha podido cambiar la foto del usuario");
		}
		ConexionBD.desconectar();
	}

	

	@Override
	public String toString() {
		return "Empleado [nombreUsuario=" + nombreUsuario + ", contrase�a=" + contrase�a + ", fotoUsuario="
				+ fotoUsuario + "]";
	}

}
