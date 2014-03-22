package mainGUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Update extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update frame = new Update();
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
	public Update() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsertNewItem = new JLabel("Please select the information you want to update");
		lblInsertNewItem.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInsertNewItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertNewItem.setBounds(0, 11, 560, 44);
		contentPane.add(lblInsertNewItem);
		
		JLabel lblChooseATable = new JLabel("Choose a table:");
		lblChooseATable.setBounds(119, 81, 104, 16);
		contentPane.add(lblChooseATable);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "band", "musician", "genre", "album", "song", "concert", "award"}));
		comboBox.setBounds(256, 78, 195, 22);
		contentPane.add(comboBox);
		
		JLabel lblChooseAField = new JLabel("Choose an item:");
		lblChooseAField.setBounds(119, 126, 96, 16);
		contentPane.add(lblChooseAField);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(256, 123, 195, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Choose a field:");
		lblNewLabel.setBounds(119, 176, 96, 16);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(256, 173, 195, 22);
		contentPane.add(comboBox_2);
		
		JLabel lblReplaceWith = new JLabel("Replace with:");
		lblReplaceWith.setBounds(119, 225, 96, 16);
		contentPane.add(lblReplaceWith);
		
		textField = new JTextField();
		textField.setBounds(256, 222, 195, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK!");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOk.setBounds(463, 403, 97, 25);
		contentPane.add(btnOk);
	}
}
