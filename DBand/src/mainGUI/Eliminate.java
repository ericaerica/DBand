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
import javax.swing.JButton;

public class Eliminate extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eliminate frame = new Eliminate();
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
	public Eliminate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatWouldYou = new JLabel("What would you like to eliminate?");
		lblWhatWouldYou.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWhatWouldYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatWouldYou.setBounds(10, 11, 311, 34);
		contentPane.add(lblWhatWouldYou);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(10, 94, 156, 20);
		contentPane.add(comboBox);
		
		JLabel lblEliminateASingle = new JLabel("Eliminate a single object");
		lblEliminateASingle.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminateASingle.setBounds(10, 56, 311, 28);
		contentPane.add(lblEliminateASingle);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setBounds(176, 94, 145, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblEliminateMultipleObjects = new JLabel("Eliminate multiple objects");
		lblEliminateMultipleObjects.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminateMultipleObjects.setBounds(10, 207, 311, 27);
		contentPane.add(lblEliminateMultipleObjects);
		
		JLabel lblAll = new JLabel("All");
		lblAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblAll.setBounds(10, 245, 46, 14);
		contentPane.add(lblAll);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(66, 245, 122, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblWhose = new JLabel("Whose");
		lblWhose.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhose.setBounds(75, 275, 46, 14);
		contentPane.add(lblWhose);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEnabled(false);
		comboBox_3.setBounds(131, 272, 122, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEnabled(false);
		comboBox_4.setBounds(199, 303, 122, 20);
		contentPane.add(comboBox_4);
		
		JLabel lblIs = new JLabel("Is");
		lblIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblIs.setBounds(142, 306, 46, 14);
		contentPane.add(lblIs);
		
		JButton btnGo = new JButton("GO!");
		btnGo.setBounds(115, 134, 89, 23);
		contentPane.add(btnGo);
		
		JButton btnGo_1 = new JButton("GO!");
		btnGo_1.setBounds(115, 334, 89, 23);
		contentPane.add(btnGo_1);
	}
}
