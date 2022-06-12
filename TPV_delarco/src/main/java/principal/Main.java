package principal;

import java.sql.SQLException;

import interfacesGraficas.Ventana;
import utils.CrearBD;

public class Main {

	/**
	 * 
	 * @param args
	 * @author fdelarco DAW
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			CrearBD.crearBD();
			CrearBD.crearTablas();
		} catch (SQLException e) {
			System.out.println("Base de datos ya existe");
		}
		
		Ventana ventana=new Ventana();

	}

}
