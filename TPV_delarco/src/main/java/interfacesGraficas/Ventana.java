package interfacesGraficas;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana extends JFrame {
	private String[] args;
	private JPanel pantallaActual;

	public Ventana(String[] args) {

		this.setArgs(args);

		this.setSize(500, 499);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle("TPV Delarco");
		this.setIconImage(new ImageIcon(Ventana.class.getResource("/image/iconoVentana.jpg")).getImage());
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
			this.setSize(500,500);
			this.setLocationRelativeTo(null);
			break;
		case "registro":
			this.pantallaActual = new PantallaRegistro(this);
			this.setSize(500,500);
			this.setLocationRelativeTo(null);
			break;

		case "mesa":
			this.pantallaActual = new MapaMesas(this);
			this.setSize(915, 530);
			this.setLocationRelativeTo(null);
			break;
		}
		this.setContentPane(pantallaActual);
		this.pantallaActual.setVisible(true);
		
	}

	
	public void irAPantalla(String nombrePantalla, byte numeroMesa) {

		this.pantallaActual.setVisible(false);
		this.pantallaActual.setLayout(null);
		
		switch (nombrePantalla) {

		case "comanda":
			this.pantallaActual = new PrincipalComanda(this, numeroMesa);
			this.setSize(915, 530);
			this.setLocationRelativeTo(null);
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
