package mainGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Search extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatAreYou = new JLabel("What are you looking for?");
		lblWhatAreYou.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWhatAreYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatAreYou.setBounds(10, 11, 338, 56);
		contentPane.add(lblWhatAreYou);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"All info related to a Band", "All info related to a Genre", "All info related to a Record Label", "All info related to the Awards", "All info related to the Musicians", "The answer to Life, the Universe, and Everything"}));
		comboBox.setBounds(30, 84, 302, 20);
		contentPane.add(comboBox);
	}

}
