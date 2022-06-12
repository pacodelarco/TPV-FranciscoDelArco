package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import clases.Empleado;
import excepciones.ContrasegnaInvalidaException;
import utils.ConexionBD;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JPasswordField campoContraseña;

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
		atrasButton.setBounds(309, 371, 85, 21);
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
				String contraseña=new String (campoContraseña.getPassword());
				try {
					Empleado nuevoEmpleado = new Empleado(nombre, usuario, contraseña, null);
					JOptionPane.showMessageDialog(ventana, "Registrado con éxito","Registro Completado",JOptionPane.PLAIN_MESSAGE);
				
					ventana.irAPantalla("login");
				}catch (SQLException | ContrasegnaInvalidaException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNewButton.setBounds(258, 318, 201, 25);
		add(btnNewButton);
		
		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(267, 273, 179, 19);
		add(campoContraseña);
		campoContraseña.setColumns(10);

		JLabel fondoLabel = new JLabel("fondo");
		fondoLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fondoLabel.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/image/pantallaLogin.png")));
		fondoLabel.setBounds(0, 0, 500, 500);
		add(fondoLabel);

	}
}
