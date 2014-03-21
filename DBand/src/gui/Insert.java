package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class Insert extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert frame = new Insert();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Insert() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 170, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsertNewItem = new JLabel("Insert New Item");
		lblInsertNewItem.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInsertNewItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertNewItem.setBounds(10, 11, 134, 44);
		contentPane.add(lblInsertNewItem);
		
		JButton btnAlbum = new JButton("Album");
		btnAlbum.setBounds(30, 62, 89, 23);
		contentPane.add(btnAlbum);
		
		JButton btnBand = new JButton("Band");
		btnBand.setBounds(30, 96, 89, 23);
		contentPane.add(btnBand);
		
		JButton btnConcert = new JButton("Concert");
		btnConcert.setBounds(30, 130, 89, 23);
		contentPane.add(btnConcert);
		
		JButton btnAward = new JButton("Award");
		btnAward.setBounds(30, 164, 89, 23);
		contentPane.add(btnAward);
	}

}
