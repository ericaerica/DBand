package insertionGUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class NominationInsertion extends JFrame {

	private JPanel contentPane;
	private JTextField txtYyyy;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NominationInsertion frame = new NominationInsertion();
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
	public NominationInsertion() {
		setTitle("Nomination Insertion");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompleteTheField = new JLabel("Complete the fields to insert a Nomination");
		lblCompleteTheField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCompleteTheField.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompleteTheField.setBounds(10, 11, 414, 19);
		contentPane.add(lblCompleteTheField);
		
		JLabel lblBand = new JLabel("Band");
		lblBand.setBounds(230, 62, 46, 14);
		contentPane.add(lblBand);
		
		JComboBox comboAward = new JComboBox();
		comboAward.setBounds(103, 59, 86, 20);
		contentPane.add(comboAward);
		
		
		JLabel lblAward = new JLabel("Award");
		lblAward.setBounds(54, 62, 46, 14);
		contentPane.add(lblAward);
		
		JComboBox comboBand = new JComboBox();
		comboBand.setBounds(286, 59, 84, 17);
		contentPane.add(comboBand);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(54, 121, 46, 14);
		contentPane.add(lblYear);
		
		txtYyyy = new JTextField();
		txtYyyy.setText("YYYY");
		txtYyyy.setBounds(103, 118, 86, 20);
		contentPane.add(txtYyyy);
		txtYyyy.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(230, 121, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(286, 118, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(54, 174, 46, 14);
		contentPane.add(lblCategory);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 171, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblWin = new JLabel("Win");
		lblWin.setBounds(230, 174, 46, 14);
		contentPane.add(lblWin);
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBounds(286, 170, 109, 23);
		contentPane.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(286, 199, 109, 23);
		contentPane.add(rdbtnNo);
		
		group.add(rdbtnYes);
		group.add(rdbtnNo);
		
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(345, 238, 89, 23);
		contentPane.add(btnDone);
	} 
}
