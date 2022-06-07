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
				Statement smt = conn.createStatement();) {

			String sql = "create database tpv;";
			smt.executeUpdate(sql);
			// smt.executeUpdate("DROP DATABASE IF EXISTS tpv");
			// smt.executeUpdate("CREATE DATABASE tpv");
			// smt.executeUpdate("USE tpv");

			System.out.println("Base de datos creada con exito");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void crearTablas() throws SQLException {
		Statement smt = ConexionBD.conectar();

		smt.executeUpdate("CREATE TABLE `empleado` ( `nombre` varchar(30) NOT NULL, nombreUsuario` varchar(15) NOT NULL, `contraseña` varchar(20) NOT NULL, `fotoUsuario` blob, PRIMARY KEY (`nombreUsuario`), UNIQUE KEY `nombreUsuario` (`nombreUsuario`);");
		// Y aqui las demas tablas
// CREATE TABLE `empleado` ( `nombre` varchar(30) NOT NULL, nombreUsuario` varchar(15) NOT NULL, `contraseña` varchar(20) NOT NULL, `fotoUsuario` blob, PRIMARY KEY (`nombreUsuario`), UNIQUE KEY `nombreUsuario` (`nombreUsuario`);
		ConexionBD.desconectar();
	}
}
