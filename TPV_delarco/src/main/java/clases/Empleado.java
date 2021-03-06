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
	private String contraseņa;
	private BufferedImage fotoUsuario;
	

	public Empleado(String nombre, String nombreUsuario, String contraseņa, BufferedImage fotoUsuario)
			throws SQLException, ContrasegnaInvalidaException {

		super(nombre);

		if (!isValidPass(contraseņa)) {
			throw new ContrasegnaInvalidaException("La contraseņa debe tener al menos 3 caracteres");
		}
		Statement stmt = ConexionBD.conectar();
		if (stmt.executeUpdate("INSERT INTO empleado (nombre, nombreUsuario,contraseņa,fotoUsuario) VALUES('" + nombre + "','" + nombreUsuario + "','" + contraseņa+ "','" + fotoUsuario + "')") > 0) {
			// Solo si todo ha ido bien insertando, se modifican las variables internas
			this.nombreUsuario = nombreUsuario;
			this.contraseņa = contraseņa;
			this.fotoUsuario = fotoUsuario;
			
			System.out.println("Usuario registrado correctamente");
			
		} else {
			ConexionBD.desconectar();
			throw new SQLException("Hubo un fallo al insertar los datos");
		}
		ConexionBD.desconectar();

	}

	public Empleado( String nombreUsuario, String contraseņa ) throws SQLException,
			ContrasegnaIncorrectaException, UsuarioNoExisteException, ContrasegnaInvalidaException {
		super();

		if (!isValidPass(contraseņa)) {
			throw new ContrasegnaInvalidaException("La contraseņa debe tener al menos 3 caracteres");
		}

		Statement stmt = ConexionBD.conectar();
		ResultSet cursor = stmt.executeQuery("SELECT * FROM empleado WHERE nombreUsuario='" + nombreUsuario + "'");

		if (cursor.next()) {
			this.contraseņa = cursor.getString("contraseņa");
			if (!this.contraseņa.equals(contraseņa)) {
				ConexionBD.desconectar();
				throw new ContrasegnaIncorrectaException("La contraseņa no es correcta");
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
		Statement stmt = ConexionBD.conectar();
		if (stmt.executeUpdate("UPDATE empleado SET nombreUsuario='" + nombreUsuario + "' WHERE nombreUsuario='"
				+ this.nombreUsuario + "'") > 0) {
			this.nombreUsuario = nombreUsuario;
		} else {
			ConexionBD.desconectar();
			throw new SQLException("No se ha podido cambiar el nombre de usuario");
		}
		ConexionBD.desconectar();
	}

	public String getContraseņa() {
		return contraseņa;
	}

	public static boolean isValidPass(String contraseņa) {
		try {
			if (contraseņa.length() < 3) {
				return false;
			} else {
				return true;
			}
		} catch (NullPointerException e) {
			return false;
		}

	}

	public void setContraseņa(String contraseņa) throws SQLException, ContrasegnaInvalidaException {

		if (!isValidPass(contraseņa)) {
			throw new ContrasegnaInvalidaException("La contraseņa debe tener al menos 3 caracteres");
		}

		Statement stmt = ConexionBD.conectar();
		if (stmt.executeUpdate("UPDATE empleado SET contraseņa='" + contraseņa + "' WHERE nombreUsuario='"
				+ this.nombreUsuario + "'") > 0) {
			this.contraseņa = contraseņa;
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
		Statement stmt = ConexionBD.conectar();
		if (stmt.executeUpdate("UPDATE empleado SET fotoUsuario='" + fotoUsuario + "' WHERE nombreUsuario='"
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
		return "Empleado [nombreUsuario=" + nombreUsuario + ", contraseņa=" + contraseņa + ", fotoUsuario="
				+ fotoUsuario + "]";
	}

}
