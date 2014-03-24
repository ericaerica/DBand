package insertionGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BandInsertion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField txtGenregenregenre;

	/**
	 * Create the frame.
	 * 
	 */
	public BandInsertion() {
		setTitle("Band Insertion");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 764, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompleteTheFields = new JLabel("Complete the fields to insert a new band");
		lblCompleteTheFields.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompleteTheFields.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCompleteTheFields.setBounds(0, 44, 734, 32);
		contentPane.add(lblCompleteTheFields);
		
		JLabel lblNameOfThe = new JLabel("Name of the band:");
		lblNameOfThe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNameOfThe.setBounds(186, 106, 144, 22);
		contentPane.add(lblNameOfThe);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(381, 107, 175, 22);
		contentPane.add(textField);
		
		JLabel lblCountryOfOrigin = new JLabel("Country of origin:");
		lblCountryOfOrigin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCountryOfOrigin.setBounds(185, 141, 118, 22);
		contentPane.add(lblCountryOfOrigin);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGenre.setBounds(186, 178, 156, 16);
		contentPane.add(lblGenre);
		
		JLabel lblMembers = new JLabel("Members (name;surname;stage name;country of birth;date of birth;active/inactive;instrument):");
		lblMembers.setVerticalAlignment(SwingConstants.TOP);
		lblMembers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMembers.setBounds(57, 224, 640, 32);
		contentPane.add(lblMembers);
		
		textField_2 = new JTextField();
		textField_2.setBounds(381, 141, 175, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		txtGenregenregenre = new JTextField();
		txtGenregenregenre.setText("genre1;genre2;genre3");
		txtGenregenregenre.setBounds(381, 176, 175, 22);
		contentPane.add(txtGenregenregenre);
		txtGenregenregenre.setColumns(10);
		
		JButton button = new JButton("Insert!");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(649, 522, 97, 25);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(100, 269, 541, 235);
		contentPane.add(scrollPane);
		
		JTextArea txtrPleasePressEnter = new JTextArea();
		scrollPane.setViewportView(txtrPleasePressEnter);
		txtrPleasePressEnter.setText("please press enter key after the info about every  member");
	}
}
