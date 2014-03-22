package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ConcertInsertion extends JFrame {

	private JPanel contentPane;
	private JTextField txtDdmmyyyy;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtName;
	private JTextField txtHhmmss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConcertInsertion frame = new ConcertInsertion();
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
	
	
	public ConcertInsertion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompleteTheFields = new JLabel("Complete the fields to insert a new Concert");
		lblCompleteTheFields.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCompleteTheFields.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompleteTheFields.setBounds(10, 11, 442, 19);
		contentPane.add(lblCompleteTheFields);
		
		JLabel lblBand = new JLabel("Band");
		lblBand.setBounds(178, 68, 46, 14);
		contentPane.add(lblBand);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(62, 112, 46, 14);
		contentPane.add(lblDate);
		
		JLabel lblPlace = new JLabel("Place");
		lblPlace.setBounds(236, 112, 46, 14);
		contentPane.add(lblPlace);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(62, 158, 46, 14);
		contentPane.add(lblCountry);
		
		JLabel lblSongs = new JLabel("Tour");
		lblSongs.setBounds(236, 158, 46, 14);
		contentPane.add(lblSongs);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setText("DD/MM/YYYY");
		txtDdmmyyyy.setBounds(121, 109, 86, 20);
		contentPane.add(txtDdmmyyyy);
		txtDdmmyyyy.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 109, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 155, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(308, 155, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(363, 339, 89, 23);
		contentPane.add(btnDone);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(279, 68, 28, 20);
		contentPane.add(comboBox);
		
		JLabel lblSongs_1 = new JLabel("Songs");
		lblSongs_1.setBounds(62, 214, 46, 14);
		contentPane.add(lblSongs_1);
		
		JButton button = new JButton("+");
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(337, 210, 57, 23);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(121, 212, 215, 139);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(10, 11, 86, 20);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		txtHhmmss = new JTextField();
		txtHhmmss.setText("hh:mm:ss");
		txtHhmmss.setBounds(117, 11, 86, 20);
		panel_1.add(txtHhmmss);
		txtHhmmss.setColumns(10);
	}
}
