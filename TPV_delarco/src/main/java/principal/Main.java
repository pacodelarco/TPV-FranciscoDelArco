package principal;

import java.sql.SQLException;

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
