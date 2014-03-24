package insertionGUI;


import engine.SQLConnection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ConcertInsertion extends JFrame {

	private JPanel contentPane;
	private JTextField txtDdmmyyyy;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;


	/**
	 * Create the frame.
	 */
	
	public ConcertInsertion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		lblBand.setBounds(161, 71, 46, 14);
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
		
		JComboBox comboBand = new JComboBox();
		comboBand.setBounds(234, 68, 73, 20);
		contentPane.add(comboBand);
		
		
		String options =  SQLConnection.getCurrentConnection().otherQuery("select name from band");
		comboBand.setModel(new DefaultComboBoxModel(new String[] { options }));
		
		
		JLabel lblSongs_1 = new JLabel("Songs [name; lenght (hh:mm:ss)] :");
		lblSongs_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSongs_1.setBounds(34, 203, 297, 14);
		contentPane.add(lblSongs_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 228, 305, 106);
		contentPane.add(scrollPane);
		
		JTextArea txtrPleasePressEnter = new JTextArea();
		txtrPleasePressEnter.setText("Please press enter key after every length");
		scrollPane.setViewportView(txtrPleasePressEnter);
	}
}
