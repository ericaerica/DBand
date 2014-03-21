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

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBandDataBase = new JLabel("Band Database");
		lblBandDataBase.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblBandDataBase.setHorizontalAlignment(SwingConstants.CENTER);
		lblBandDataBase.setBounds(10, 11, 252, 49);
		contentPane.add(lblBandDataBase);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(87, 71, 89, 23);
		contentPane.add(btnSearch);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(87, 105, 89, 23);
		contentPane.add(btnInsert);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(87, 139, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(87, 173, 89, 23);
		contentPane.add(btnDelete);
	}
}
