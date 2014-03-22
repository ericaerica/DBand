package insertionGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.GridLayout;

public class BandInsertion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField txtGenregenregenre;
	private JTextField txtNameSurname;
	private JTextField txtBirthCountry;
	private JTextField txtSurname;
	private JTextField txtStageName;
	private JTextField txtDdmmyyyy;
	private JTextField txtActiveinactive;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BandInsertion frame = new BandInsertion();
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
	public BandInsertion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompleteTheFields = new JLabel("Complete the fields to insert a new band");
		lblCompleteTheFields.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompleteTheFields.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCompleteTheFields.setBounds(86, 44, 395, 32);
		contentPane.add(lblCompleteTheFields);
		
		JLabel lblNameOfThe = new JLabel("Name of the band:");
		lblNameOfThe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNameOfThe.setBounds(103, 107, 144, 22);
		contentPane.add(lblNameOfThe);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(298, 108, 175, 22);
		contentPane.add(textField);
		
		JLabel lblCountryOfOrigin = new JLabel("Country of origin:");
		lblCountryOfOrigin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCountryOfOrigin.setBounds(102, 142, 118, 22);
		contentPane.add(lblCountryOfOrigin);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGenre.setBounds(103, 179, 156, 16);
		contentPane.add(lblGenre);
		
		JLabel lblMembers = new JLabel("Members (name, surname,\r\nstage name, country of birth,\r\ndate of birth):");
		lblMembers.setVerticalAlignment(SwingConstants.TOP);
		lblMembers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMembers.setBounds(103, 233, 144, 85);
		contentPane.add(lblMembers);
		
		textField_2 = new JTextField();
		textField_2.setBounds(298, 142, 175, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		txtGenregenregenre = new JTextField();
		txtGenregenregenre.setText("genre1;genre2;genre3");
		txtGenregenregenre.setBounds(298, 177, 175, 22);
		contentPane.add(txtGenregenregenre);
		txtGenregenregenre.setColumns(10);
		
		JButton button = new JButton("Insert!");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(649, 522, 97, 25);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(298, 214, 385, 295);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel.add(panel_1);
		
		txtNameSurname = new JTextField();
		txtNameSurname.setText("name");
		txtNameSurname.setColumns(10);
		txtNameSurname.setBounds(0, 13, 70, 22);
		panel_1.add(txtNameSurname);
		
		txtBirthCountry = new JTextField();
		txtBirthCountry.setText("birth country");
		txtBirthCountry.setColumns(10);
		txtBirthCountry.setBounds(287, 13, 96, 22);
		panel_1.add(txtBirthCountry);
		
		txtSurname = new JTextField();
		txtSurname.setText("surname");
		txtSurname.setBounds(88, 13, 80, 22);
		panel_1.add(txtSurname);
		txtSurname.setColumns(10);
		
		txtStageName = new JTextField();
		txtStageName.setText("stage name");
		txtStageName.setBounds(188, 13, 87, 22);
		panel_1.add(txtStageName);
		txtStageName.setColumns(10);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setText("dd/mm/yyyy");
		txtDdmmyyyy.setBounds(0, 48, 116, 22);
		panel_1.add(txtDdmmyyyy);
		txtDdmmyyyy.setColumns(10);
		
		txtActiveinactive = new JTextField();
		txtActiveinactive.setText("active/inactive");
		txtActiveinactive.setBounds(131, 48, 116, 22);
		panel_1.add(txtActiveinactive);
		txtActiveinactive.setColumns(10);
		
		JButton button_1 = new JButton("+");
		button_1.setBounds(693, 230, 41, 25);
		contentPane.add(button_1);
	}
}
