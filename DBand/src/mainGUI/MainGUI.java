package mainGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
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
		
//******Action listeners
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search search = new Search();
				search.setVisible(true);
			}
		});
		
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Insert insert = new Insert();
				insert.setVisible(true);
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update update = new Update();
				update.setVisible(true);
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete delete = new Delete();
				delete.setVisible(true);
			}
		});
	}
}
