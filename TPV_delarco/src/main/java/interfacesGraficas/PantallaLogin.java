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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaLogin extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContrase�a;

	public PantallaLogin(Ventana v, String[] args) {
		this.ventana=v;
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
				v.irAPantalla("comanda");
			}
		});
		loginButton.setBounds(300, 351, 115, 21);
		
		//PONER USER Y PASS POR ARGS

		/*loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String nombreUsuario = campoUsuario.getText();
				String contrase�a = new String(campoContrase�a.getPassword());

				if (nombreUsuario.length() == 0 || contrase�a.length() == 0) {
					nombreUsuario = args[0];
					contrase�a = args[1];

				}

			}
		});*/
		loginButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		add(loginButton);

		JButton RegistroButton = new JButton("Registrarse");
		RegistroButton.setBounds(300, 320, 115, 21);
		RegistroButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v.irAPantalla("registro");
			
			
			}
		});
		RegistroButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		add(RegistroButton);

		JLabel fondoLabel = new JLabel("New label");
		fondoLabel.setBounds(0, 0, 500, 500);
		fondoLabel.setIcon(new ImageIcon(PantallaLogin.class.getResource("/image/pantallaLogin.png")));
		add(fondoLabel);

	}
}
