package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class PantallaRegistro extends JPanel{

	private Ventana ventana;
	private JTextField campoNombre;
	private JPasswordField campoContraseña;
	private JTextField campoUsuario;
	
	
	public PantallaRegistro(Ventana v) {
		this.ventana= v;
		
		setLayout(null);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(267, 155, 174, 19);
		add(campoNombre);
		campoNombre.setColumns(10);
		
		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setForeground(Color.BLACK);
		usuarioLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		usuarioLabel.setBounds(267, 185, 174, 19);
		add(usuarioLabel);
		
		JLabel contraseñaLabel = new JLabel("Contrase\u00F1a:");
		contraseñaLabel.setForeground(Color.BLACK);
		contraseñaLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		contraseñaLabel.setBounds(267, 246, 174, 19);
		add(contraseñaLabel);
		
		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(267, 275, 174, 19);
		add(campoContraseña);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setForeground(Color.BLACK);
		nombreLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		nombreLabel.setBounds(267, 126, 174, 19);
		add(nombreLabel);
		
		campoUsuario = new JTextField();
		campoUsuario.setColumns(10);
		campoUsuario.setBounds(267, 214, 174, 19);
		add(campoUsuario);
		
		JButton btnNewButton = new JButton("Registrar nuevo empleado");
		btnNewButton.setBounds(267, 327, 174, 21);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/imagenes/pantallaLogin.png")));
		lblNewLabel.setBounds(0, 0, 500, 500);
		add(lblNewLabel);


	}

}
