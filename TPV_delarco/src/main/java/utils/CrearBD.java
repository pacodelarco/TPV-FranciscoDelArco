package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBD {

	static final String DB_URL = "jdbc:mysql://localhost/";
	static final String USER = "root";
	static final String PASS = "";

	public static void crearBD() throws SQLException {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement smt = conn.createStatement();) {
			String sql = "CREATE DATABASE TPV_Delarco";
			smt.executeUpdate(sql);

			System.out.println("Base de datos creada con exito");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static void crearTablas() throws SQLException {
		Statement smt = ConexionBD.conectar();
		
		smt.executeUpdate("create table empleado(\r\n"
				+ "	nombre varchar(30) not null,\r\n"
				+ "    nombreUsuario varchar(15) unique,\r\n"
				+ "    fotoUsuario blob,\r\n"
				+ "    activo boolean default false,\r\n"
				+ "    primary key(nombreUsuario)\r\n"
				+ ");");
	}
}
