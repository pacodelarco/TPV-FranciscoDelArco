package interfacesGraficas;

import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import interfacesGraficas.PantallaLogin;

public class Ventana extends JFrame {
	private String[] args;
	private JPanel pantallaActual;

	public Ventana() {

		this.setArgs(args);

		this.setSize(500, 499);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setTitle("TPV Delarco");
		this.setIconImage(new ImageIcon("./imagenes/iconoVentana.jpg").getImage());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pantallaActual = new PantallaLogin(this, this.getArgs());
		this.setContentPane(new PantallaLogin(this, args));
		this.setVisible(true);

	}

	public void irAPantalla(String nombrePantalla) {

		this.pantallaActual.setVisible(false);
		this.pantallaActual.setLayout(null);
		
		switch (nombrePantalla) {
		case "login":
			this.pantallaActual = new PantallaLogin(this, this.getArgs());
			break;
		case "registro":
			this.pantallaActual = new PantallaRegistro(this);
			break;
		case "comanda":
			this.pantallaActual = new PrincipalComanda(this);
			this.setSize(915, 530);
			break;
		}
		this.setContentPane(pantallaActual);
		this.pantallaActual.setVisible(true);
		
	}

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

}
