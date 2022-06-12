package interfacesGraficas;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MapaMesas extends JPanel{
	private Ventana ventana;
	private byte numeroMesa;

	
	
	
	public MapaMesas(Ventana v) {

		this.ventana=v;
		setPreferredSize(new Dimension(900, 506));
		setLayout(null);
		
		JLabel mesaLabel1 = new JLabel("");
		mesaLabel1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				numeroMesa=1;
				ventana.irAPantalla("comanda",numeroMesa);
			}
		});
		mesaLabel1.setBounds(64, 95, 143, 137);
		add(mesaLabel1);
		
		JLabel mesaLabel2 = new JLabel("");
		mesaLabel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numeroMesa=2;
				ventana.irAPantalla("comanda",numeroMesa);
			}
		});
		mesaLabel2.setBounds(241, 95, 143, 137);
		add(mesaLabel2);
		
		JLabel mesaLabel3 = new JLabel("");
		mesaLabel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numeroMesa=3;
				ventana.irAPantalla("comanda",numeroMesa);
			}
		});
		mesaLabel3.setBounds(430, 95, 143, 137);
		add(mesaLabel3);
		
		JLabel mesaLabel4 = new JLabel("");
		mesaLabel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numeroMesa=4;
				ventana.irAPantalla("comanda",numeroMesa);
			}
		});
		mesaLabel4.setBounds(606, 95, 150, 137);
		add(mesaLabel4);
		
		JLabel mesaLabel5 = new JLabel("");
		mesaLabel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numeroMesa=5;
				ventana.irAPantalla("comanda",numeroMesa);
			}
		});
		mesaLabel5.setBounds(154, 289, 143, 137);
		add(mesaLabel5);
		
		JLabel mesaLabel6 = new JLabel("");
		mesaLabel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numeroMesa=6;
				ventana.irAPantalla("comanda",numeroMesa);
			}
		});
		mesaLabel6.setBounds(331, 289, 143, 137);
		add(mesaLabel6);
		
		JLabel mesaLabel7 = new JLabel("");
		mesaLabel7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numeroMesa=7;
				ventana.irAPantalla("comanda",numeroMesa);
			}
		});
		mesaLabel7.setBounds(520, 289, 143, 137);
		add(mesaLabel7);
		
		JLabel mesaLabel8 = new JLabel("");
		mesaLabel8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numeroMesa=8;
				ventana.irAPantalla("comanda",numeroMesa);
			}
		});
		mesaLabel8.setBounds(696, 289, 150, 137);
		add(mesaLabel8);
		
		JButton cerrarSesionButton = new JButton("Cerrar Sesi\u00F3n");
		cerrarSesionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("login");
			}
		});
		cerrarSesionButton.setBackground(Color.RED);
		cerrarSesionButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		cerrarSesionButton.setForeground(Color.WHITE);
		cerrarSesionButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cerrarSesionButton.setBounds(41, 4, 117, 19);
		add(cerrarSesionButton);
		
		JLabel fondoLabel = new JLabel("New label");
		fondoLabel.setIcon(new ImageIcon(MapaMesas.class.getResource("/image/Mesas.png")));
		fondoLabel.setBounds(0, 0, 900, 506);
		add(fondoLabel);

	}
}
