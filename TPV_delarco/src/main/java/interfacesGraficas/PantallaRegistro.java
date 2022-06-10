package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaRegistro extends JPanel{

	private Ventana ventana;
	private JTextField campoNombre;
	private JPasswordField campoContrase�a;
	private JTextField campoUsuario;
	
	
	public PantallaRegistro(Ventana v) {
		this.ventana= v;
		
		setLayout(null);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(267, 155, 179, 19);
		add(campoNombre);
		campoNombre.setColumns(10);
		
		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setForeground(Color.BLACK);
		usuarioLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		usuarioLabel.setBounds(267, 184, 174, 19);
		add(usuarioLabel);
		
		JLabel contrase�aLabel = new JLabel("Contrase\u00F1a:");
		contrase�aLabel.setForeground(Color.BLACK);
		contrase�aLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		contrase�aLabel.setBounds(267, 240, 174, 19);
		add(contrase�aLabel);
		
		campoContrase�a = new JPasswordField();
		campoContrase�a.setBounds(267, 269, 179, 19);
		add(campoContrase�a);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setForeground(Color.BLACK);
		nombreLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		nombreLabel.setBounds(267, 126, 174, 19);
		add(nombreLabel);
		
		campoUsuario = new JTextField();
		campoUsuario.setColumns(10);
		campoUsuario.setBounds(267, 213, 179, 19);
		add(campoUsuario);
		
		JButton btnNewButton = new JButton("Registrar\n nuevo empleado");
		btnNewButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNewButton.setBounds(267, 302, 179, 25);
		add(btnNewButton);
		
		JLabel fondoLabel = new JLabel("fondo");
		fondoLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fondoLabel.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/image/pantallaLogin.png")));
		fondoLabel.setBounds(0, 0, 500, 500);
		add(fondoLabel);


	}

}
