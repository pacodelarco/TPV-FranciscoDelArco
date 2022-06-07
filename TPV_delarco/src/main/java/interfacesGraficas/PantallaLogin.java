package interfacesGraficas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaLogin extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;

	public PantallaLogin(Ventana v, String[] args) {
		this.ventana=v;
		setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("hola");
			}
		});
		btnNewButton.setBounds(314, 264, 85, 21);
		add(btnNewButton);

		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setForeground(Color.BLACK);
		usuarioLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		usuarioLabel.setBounds(267, 135, 174, 19);
		add(usuarioLabel);

		campoUsuario = new JTextField();
		campoUsuario.setBounds(267, 164, 174, 19);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		JLabel contraseñaLabel = new JLabel("Contrase\u00F1a:");
		contraseñaLabel.setForeground(Color.BLACK);
		contraseñaLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		contraseñaLabel.setBounds(267, 204, 174, 19);
		add(contraseñaLabel);

		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(267, 230, 174, 19);
		add(campoContraseña);

		JButton loginButton = new JButton("Iniciar Sesi\u00F3n");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String nombreUsuario = campoUsuario.getText();
				String contraseña = new String(campoContraseña.getPassword());

				if (nombreUsuario.length() == 0 || contraseña.length() == 0) {
					nombreUsuario = args[0];
					contraseña = args[1];

				}

			}
		});
		loginButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		loginButton.setBounds(302, 295, 115, 21);
		add(loginButton);

		JButton RegistroButton = new JButton("Registrarse");
		RegistroButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ventana.irAPantalla("registro");
			}
		});
		RegistroButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		RegistroButton.setBounds(44, 370, 115, 21);
		add(RegistroButton);

		JLabel fondoLabel = new JLabel("New label");
		fondoLabel.setIcon(new ImageIcon(PantallaLogin.class.getResource("/imagenes/pantallaLogin.png")));
		fondoLabel.setBounds(0, 0, 500, 500);
		add(fondoLabel);

	}
}
