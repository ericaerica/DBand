package insertionGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

public class AlbumInsertion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtYyyy;
	private JTextField txtName;
	private JTextField txtCountry;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public AlbumInsertion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 637, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(293, 135, 175, 22);
		comboBox.setToolTipText("");
		contentPane.add(comboBox);
		
		JLabel lblInsertANew = new JLabel("Complete the fields to insert a new album");
		lblInsertANew.setBounds(81, 37, 395, 32);
		lblInsertANew.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertANew.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblInsertANew);
		
		JLabel lblName = new JLabel("Name of the album:");
		lblName.setBounds(98, 100, 144, 22);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(293, 101, 175, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBand = new JLabel("Band name:");
		lblBand.setBounds(98, 137, 118, 16);
		lblBand.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblBand);
		
		JLabel lblYear = new JLabel("Year of production:");
		lblYear.setBounds(98, 172, 156, 16);
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblYear);
		
		txtYyyy = new JTextField();
		txtYyyy.setBounds(293, 170, 175, 22);
		txtYyyy.setText("yyyy");
		txtYyyy.setToolTipText("");
		contentPane.add(txtYyyy);
		txtYyyy.setColumns(10);
		
		JLabel lblRecordLabel = new JLabel("Record Label:");
		lblRecordLabel.setBounds(98, 207, 144, 16);
		lblRecordLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblRecordLabel);
		
		txtName = new JTextField();
		txtName.setBounds(293, 205, 118, 22);
		txtName.setText("name");
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblSongs = new JLabel("Songs:");
		lblSongs.setBounds(98, 256, 56, 22);
		lblSongs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblSongs);
		
		txtCountry = new JTextField();
		txtCountry.setBounds(423, 205, 116, 22);
		txtCountry.setText("country");
		contentPane.add(txtCountry);
		txtCountry.setColumns(10);
		
		JButton btnInsert = new JButton("Insert!");
		btnInsert.setBounds(522, 452, 97, 25);
		btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnInsert);
		
		JButton btnMore = new JButton("+");
		btnMore.setBounds(566, 256, 41, 25);
		contentPane.add(btnMore);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(293, 240, 270, 199);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setRowHeaderView(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setText("title");
		textField_1.setColumns(10);
		textField_1.setBounds(0, 13, 127, 22);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("hh:mm:ss");
		textField_2.setColumns(10);
		textField_2.setBounds(139, 13, 129, 22);
		panel_1.add(textField_2);
	}
}
