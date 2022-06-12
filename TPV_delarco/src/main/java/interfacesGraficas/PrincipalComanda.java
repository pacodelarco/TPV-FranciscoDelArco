package interfacesGraficas;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrincipalComanda extends JPanel {

	private Ventana ventana;


	public PrincipalComanda(Ventana v, byte mesa) {
		this.ventana = v;
	
		setLayout(null);

		JButton bocadilloButton = new JButton("BOCADILLO");
		bocadilloButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		bocadilloButton.setBounds(740, 38, 135, 36);
		add(bocadilloButton);

		JButton racionButton = new JButton("RACI\u00D3N");
		racionButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		racionButton.setBounds(595, 38, 135, 36);
		add(racionButton);

		JButton bebidaButton = new JButton("BEBIDA");
		bebidaButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		bebidaButton.setBounds(301, 38, 138, 36);
		add(bebidaButton);

		JButton tapaButton = new JButton("TAPA");
		tapaButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		tapaButton.setBounds(449, 38, 136, 36);
		add(tapaButton);

		JTextPane ticketText = new JTextPane();
		ticketText.setEditable(false);
		ticketText.setOpaque(false);
		ticketText.setBounds(35, 104, 213, 353);
		add(ticketText);

		JTextPane mesaXText = new JTextPane();
		mesaXText.setEditable(false);
		mesaXText.setFont(new Font("Microsoft PhagsPa", Font.BOLD | Font.ITALIC, 20));
		mesaXText.setOpaque(false);
		mesaXText.setText("Ticket Mesa "+mesa);
		mesaXText.setBounds(65, 38, 148, 36);
		add(mesaXText);

		JButton elemButton1 = new JButton("New button");
		elemButton1.setBounds(301, 104, 138, 112);
		add(elemButton1);

		JButton elemButton2 = new JButton("New button");
		elemButton2.setBounds(449, 104, 138, 112);
		add(elemButton2);

		JButton elemButton3 = new JButton("New button");
		elemButton3.setBounds(595, 104, 138, 112);
		add(elemButton3);

		JButton elemButton4 = new JButton("New button");
		elemButton4.setBounds(740, 104, 138, 112);
		add(elemButton4);

		JButton elemButton5 = new JButton("New button");
		elemButton5.setBounds(301, 233, 138, 112);
		add(elemButton5);

		JButton elemButton6 = new JButton("New button");
		elemButton6.setBounds(449, 233, 138, 112);
		add(elemButton6);

		JButton elemButton7 = new JButton("New button");
		elemButton7.setBounds(595, 233, 138, 112);
		add(elemButton7);

		JButton elemButton8 = new JButton("New button");
		elemButton8.setBounds(740, 233, 138, 112);
		add(elemButton8);

		JButton elemButton9 = new JButton("New button");
		elemButton9.setBounds(301, 362, 138, 112);
		add(elemButton9);

		JButton elemButton10 = new JButton("New button");
		elemButton10.setBounds(449, 362, 138, 112);
		add(elemButton10);

		JButton elemButton11 = new JButton("New button");
		elemButton11.setBounds(595, 362, 138, 112);
		add(elemButton11);

		JButton elemButton12 = new JButton("New button");
		elemButton12.setBounds(740, 362, 138, 112);
		add(elemButton12);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PrincipalComanda.class.getResource("/image/Comanda.png")));
		lblNewLabel.setBounds(0, 0, 900, 506);
		add(lblNewLabel);

		// LISTENERS//
		bebidaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bebidaButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				bebidaButton.setEnabled(true);
				racionButton.setEnabled(false);
				bocadilloButton.setEnabled(false);
				tapaButton.setEnabled(false);

			}
		});

		tapaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				tapaButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				tapaButton.setEnabled(true);
				racionButton.setEnabled(false);
				bocadilloButton.setEnabled(false);
				bebidaButton.setEnabled(false);
			}
		});

		racionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				racionButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				racionButton.setEnabled(true);
				tapaButton.setEnabled(false);
				bocadilloButton.setEnabled(false);
				bebidaButton.setEnabled(false);
			}
		});

		bocadilloButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bocadilloButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				bocadilloButton.setEnabled(true);
				tapaButton.setEnabled(false);
				racionButton.setEnabled(false);
				bebidaButton.setEnabled(false);
			}
		});
	}
}
