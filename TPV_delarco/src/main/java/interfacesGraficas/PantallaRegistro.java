package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import clases.Empleado;
import excepciones.ContrasegnaInvalidaException;
import utils.ConexionBD;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Statement;

public class PantallaRegistro extends JPanel {

	private Ventana ventana;
	private JTextField campoNombre;
	private JTextField campoUsuario;
	private JTextField campoContraseña;

	public PantallaRegistro(Ventana v) {
		this.ventana = v;
		setLayout(null);

		JButton atrasButton = new JButton("Volver");
		atrasButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("login");
			}
		});
		atrasButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		atrasButton.setBounds(313, 337, 85, 21);
		add(atrasButton);

		campoNombre = new JTextField();
		campoNombre.setBounds(267, 155, 179, 19);
		add(campoNombre);
		campoNombre.setColumns(10);

		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setForeground(Color.BLACK);
		usuarioLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		usuarioLabel.setBounds(267, 184, 174, 19);
		add(usuarioLabel);

		JLabel contraseñaLabel = new JLabel("Contrase\u00F1a:");
		contraseñaLabel.setForeground(Color.BLACK);
		contraseñaLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		contraseñaLabel.setBounds(267, 240, 174, 19);
		add(contraseñaLabel);

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
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre=campoNombre.getText();
				String usuario=campoUsuario.getText();
				String contraseña=campoContraseña.getText();
				try {
					Empleado nuevoEmpleado = new Empleado(nombre, usuario, contraseña, null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ContrasegnaInvalidaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNewButton.setBounds(256, 302, 201, 25);
		add(btnNewButton);
		
		campoContraseña = new JTextField();
		campoContraseña.setBounds(267, 273, 174, 19);
		add(campoContraseña);
		campoContraseña.setColumns(10);

		JLabel fondoLabel = new JLabel("fondo");
		fondoLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fondoLabel.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/image/pantallaLogin.png")));
		fondoLabel.setBounds(0, 0, 500, 500);
		add(fondoLabel);

	}
}
