package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import clases.Empleado;
import excepciones.ContrasegnaIncorrectaException;
import excepciones.ContrasegnaInvalidaException;
import excepciones.UsuarioNoExisteException;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class PantallaLogin extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContrase�a;

	public PantallaLogin(Ventana v, String[] args) {

		this.ventana = v;
		setLayout(null);

		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setBounds(267, 135, 174, 19);
		usuarioLabel.setForeground(Color.BLACK);
		usuarioLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		add(usuarioLabel);

		campoUsuario = new JTextField();
		campoUsuario.setBounds(267, 164, 174, 19);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		JLabel contrase�aLabel = new JLabel("Contrase\u00F1a:");
		contrase�aLabel.setBounds(267, 230, 174, 19);
		contrase�aLabel.setForeground(Color.BLACK);
		contrase�aLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		add(contrase�aLabel);

		campoContrase�a = new JPasswordField();
		campoContrase�a.setBounds(267, 256, 174, 19);
		add(campoContrase�a);

		JButton loginButton = new JButton("Iniciar Sesi\u00F3n");

		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombreUsuario= campoUsuario.getText();
				String contrase�a=new String (campoContrase�a.getPassword());
				
				if (nombreUsuario.length() <= 0 || contrase�a.length() <= 0) {
					nombreUsuario = args[0];
					contrase�a = args[1];

				}
				
				try {
					Empleado cargarUsuario=new Empleado(nombreUsuario, contrase�a);
					ventana.irAPantalla("mesa");

				} catch (SQLException | ContrasegnaIncorrectaException | UsuarioNoExisteException
						| ContrasegnaInvalidaException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		loginButton.setBounds(300, 351, 115, 21);

		// PONER USER Y PASS POR ARGS

		
		loginButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		add(loginButton);

		JButton registrarseButton = new JButton("Registrarse");
		registrarseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("registro");

			}
		});
		registrarseButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		registrarseButton.setBounds(300, 382, 115, 21);
		add(registrarseButton);

		JLabel fondoLabel = new JLabel("New label");
		fondoLabel.setIcon(new ImageIcon(PantallaLogin.class.getResource("/image/pantallaLogin.png")));
		fondoLabel.setBounds(0, 0, 500, 500);
		add(fondoLabel);

	}
}
