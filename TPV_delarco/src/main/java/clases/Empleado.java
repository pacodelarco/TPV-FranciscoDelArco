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
	private String contraseña;
	private BufferedImage fotoUsuario;
	

	public Empleado(String nombre, String nombreUsuario, String contraseña, BufferedImage fotoUsuario)
			throws SQLException, ContrasegnaInvalidaException {

		super(nombre);

		if (!isValidPass(contraseña)) {
			throw new ContrasegnaInvalidaException("La contraseña debe tener al menos 3 caracteres");
		}
		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("INSERT INTO Empleado VALUES('" + nombre + "','" + nombreUsuario + "','" + contraseña
				+ "','" + fotoUsuario + ")") > 0) {
			// Solo si todo ha ido bien insertando, se modifican las variables internas
			this.nombreUsuario = nombreUsuario;
			this.contraseña = contraseña;
			this.fotoUsuario = fotoUsuario;
			
		} else {
			ConexionBD.desconectar();
			throw new SQLException("Hubo un fallo al insertar los datos");
		}
		ConexionBD.desconectar();

	}

	public Empleado(String nombre, String nombreUsuario, String contraseña ) throws SQLException,
			ContrasegnaIncorrectaException, UsuarioNoExisteException, ContrasegnaInvalidaException {
		super(nombre);

		if (!isValidPass(contraseña)) {
			throw new ContrasegnaInvalidaException("La contraseña debe tener al menos 3 caracteres");
		}

		Statement smt = ConexionBD.conectar();
		ResultSet cursor = smt.executeQuery("SELECT * FROM empleado WHERE nombreUsuario='" + nombreUsuario + "'");

		if (cursor.next()) {
			this.contraseña = cursor.getString("contraseña");
			if (!this.contraseña.equals(contraseña)) {
				ConexionBD.desconectar();
				throw new ContrasegnaIncorrectaException("La contraseña no es correcta");
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

	public String getContraseña() {
		return contraseña;
	}

	public static boolean isValidPass(String contraseña) {
		try {
			if (contraseña.length() < 3) {
				return false;
			} else {
				return true;
			}
		} catch (NullPointerException e) {
			return false;
		}

	}

	public void setContraseña(String contraseña) throws SQLException, ContrasegnaInvalidaException {

		if (!isValidPass(contraseña)) {
			throw new ContrasegnaInvalidaException("La contraseña debe tener al menos 3 caracteres");
		}

		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("UPDATE empleado SET contraseña='" + contraseña + "' WHERE nombreUsuario='"
				+ this.nombreUsuario + "'") > 0) {
			this.contraseña = contraseña;
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
		return "Empleado [nombreUsuario=" + nombreUsuario + ", contraseña=" + contraseña + ", fotoUsuario="
				+ fotoUsuario + "]";
	}

}
