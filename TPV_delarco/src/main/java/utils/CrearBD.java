package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBD {

	static final String DB_URL = "jdbc:mysql://localhost/";
	static final String USER = "root";
	static final String PASS = "user";

	public static void crearBD() throws SQLException {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {

			String sql = "create database tpv;";
			stmt.executeUpdate(sql);


			System.out.println("Base de datos creada con exito");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void crearTablas() throws SQLException {
		Statement stmt = ConexionBD.conectar();

		stmt.executeUpdate("CREATE TABLE empleado (nombre varchar(30) NOT NULL, nombreUsuario varchar(15) NOT NULL, contraseña varchar(30) NOT NULL,  fotoUsuario blob, PRIMARY KEY (nombreUsuario), UNIQUE KEY nombreUsuario (nombreUsuario))");
		stmt.executeUpdate("CREATE TABLE bebida (alcoholica tinyint(1) DEFAULT NULL, precio float DEFAULT NULL, foto blob, nombre varchar(100) NOT NULL, restaurante varchar(11) NOT NULL, PRIMARY KEY (nombre,restaurante), KEY restaurante (restaurante), CONSTRAINT bebida_ibfk_1 FOREIGN KEY (restaurante) REFERENCES restaurante (cif))");
		stmt.executeUpdate("CREATE TABLE bocadillo (tamaño enum('VIENA','PITUFO') DEFAULT NULL, precio float DEFAULT NULL, foto blob, nombre varchar(100) NOT NULL, restaurante varchar(11) NOT NULL, PRIMARY KEY (nombre,restaurante), KEY restaurante (restaurante), CONSTRAINT bocadillo_ibfk_1 FOREIGN KEY (restaurante) REFERENCES restaurante (cif))");
		stmt.executeUpdate("CREATE TABLE carta ( id int NOT NULL,  productos_TreeMap varchar(45) DEFAULT NULL,  PRIMARY KEY (id))");
		stmt.executeUpdate("CREATE TABLE comanda ( id int NOT NULL, empleado_nombreUsuario varchar(45) DEFAULT NULL, PRIMARY KEY (id), UNIQUE KEY id_UNIQUE (id))");
		stmt.executeUpdate("CREATE TABLE mesa ( id int NOT NULL, comanda_id int DEFAULT NULL, PRIMARY KEY (id), UNIQUE KEY id_UNIQUE (id))");
		stmt.executeUpdate("CREATE TABLE racion ( tamaño enum('MEDIA','ENTERA') DEFAULT NULL, precio float DEFAULT NULL, foto blob, nombre varchar(100) NOT NULL, restaurante varchar(11) NOT NULL, PRIMARY KEY (nombre,restaurante), KEY restaurante (restaurante), CONSTRAINT racion_ibfk_1 FOREIGN KEY (restaurante) REFERENCES restaurante (cif))");
		stmt.executeUpdate("CREATE TABLE restaurante ( cif varchar(9) NOT NULL, direccion varchar(100) DEFAULT NULL, telefono int DEFAULT NULL, carta_id int DEFAULT NULL, mesa_id int DEFAULT NULL, PRIMARY KEY (cif), UNIQUE KEY cif_UNIQUE (cif))");
		stmt.executeUpdate("CREATE TABLE tapa ( precio float DEFAULT NULL, foto blob, nombre varchar(100) NOT NULL, restaurante varchar(11) NOT NULL, PRIMARY KEY (nombre,restaurante), KEY restaurante (restaurante), CONSTRAINT tapa_ibfk_1 FOREIGN KEY (restaurante) REFERENCES restaurante (cif))");
		stmt.executeUpdate("INSERT INTO empleado (nombre, nombreUsuario, contraseña) VALUES ('admin', 'admin', 'admin')");

		
		ConexionBD.desconectar();
	}
}
