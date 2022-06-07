package interfacesGraficas;

import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import interfacesGraficas.PantallaLogin;

public class Ventana extends JFrame {
	private String[] args;
	private JPanel pantallaActual;


	public Ventana(String[] args) {

		this.setArgs(args);

		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle("TPV Delarco");
		this.setIconImage(new ImageIcon("./imagenes/iconoVentana.jpg").getImage());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pantallaActual = new PantallaLogin(this, args);
		this.setContentPane(new PantallaLogin(this, this.getArgs()));
		this.setVisible(true);

	}

	public void irAPantalla(String nombrePantalla) {

		this.pantallaActual.setVisible(false);
		this.pantallaActual = null;

		switch (nombrePantalla) {
		case "login":
			this.pantallaActual = new PantallaLogin(this, this.getArgs());
			break;
		case "registro":
			this.pantallaActual = new PantallaRegistro(this);
			break;
		}
		

		this.pantallaActual.setVisible(true);
		this.setContentPane(pantallaActual);
		}

	

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

}
