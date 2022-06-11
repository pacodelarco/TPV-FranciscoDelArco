package interfacesGraficas;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;

public class PrincipalComanda extends JPanel {

	private Ventana ventana;

	public PrincipalComanda(Ventana v) {
		this.ventana=v;
		
		setLayout(null);
		
		JButton bocadilloButton = new JButton("BOCADILLO");
		bocadilloButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		bocadilloButton.setBounds(755, 38, 117, 36);
		add(bocadilloButton);
		
		JButton racionButton = new JButton("RACI\u00D3N");
		racionButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		racionButton.setBounds(610, 38, 117, 36);
		add(racionButton);
		
		JButton bebidaButton = new JButton("BEBIDA");
		bebidaButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		bebidaButton.setBounds(316, 38, 117, 36);
		add(bebidaButton);
		
		JButton tapaButton = new JButton("TAPA");
		tapaButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		tapaButton.setBounds(464, 38, 117, 36);
		add(tapaButton);
		
		JTextPane ticketText = new JTextPane();
		ticketText.setEditable(false);
		ticketText.setOpaque(false);
		ticketText.setBounds(35, 104, 213, 353);
		add(ticketText);
		
		JLabel fondoLabel = new JLabel("New label");
		fondoLabel.setIcon(new ImageIcon(PrincipalComanda.class.getResource("/image/Comanda.png")));
		fondoLabel.setBounds(0, 0, 900, 506);
		add(fondoLabel);

	}
}
