package principal;

import java.sql.SQLException;

import interfacesGraficas.Ventana;
import utils.CrearBD;

/**
 * Clase Principal, donde se desarrollará la creacion de la base de datos y de interfaces graficas
 * 
 * @author fdelarco DAW
 */
public class Main {
	/**
	 * Funcion Main. intenta llamar a la clase utils para que creen la base de datos y la stablas 
	 * luego instancia la interfaz Ventana.
	 * @param args, se pasan por argumentos el usuario y cintraseña del usuario admin
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			CrearBD.crearBD();
			CrearBD.crearTablas();
		} catch (SQLException e) {
			System.out.println("La base de datos ya esta creada");
		}
		
		Ventana ventana=new Ventana(args);

	}

}
