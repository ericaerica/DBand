package mainGUI;

import insertionGUI.AlbumInsertion;
import insertionGUI.BandInsertion;
import insertionGUI.ConcertInsertion;
import insertionGUI.NominationInsertion;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Insert extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Insert() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		setBounds(100, 100, 170, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsertNewItem = new JLabel("Insert New Item");
		lblInsertNewItem.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInsertNewItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertNewItem.setBounds(10, 11, 134, 44);
		contentPane.add(lblInsertNewItem);
		
		JRadioButton btnAlbum = new JRadioButton("Album");
		btnAlbum.setBounds(30, 62, 89, 23);
		contentPane.add(btnAlbum);
		
		JRadioButton btnBand = new JRadioButton("Band");
		btnBand.setBounds(30, 96, 89, 23);
		contentPane.add(btnBand);
		
		JRadioButton btnConcert = new JRadioButton("Concert");
		btnConcert.setBounds(30, 130, 89, 23);
		contentPane.add(btnConcert);
		
		JRadioButton btnAward = new JRadioButton("Award");
		btnAward.setBounds(30, 164, 89, 23);
		contentPane.add(btnAward);
	
		ButtonGroup group = new ButtonGroup();
		group.add(btnAward);
		group.add(btnConcert);
		group.add(btnBand);
		group.add(btnAlbum);
	//****************************** Action Listener ************************************//
		
		btnAlbum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlbumInsertion album = new AlbumInsertion();
				album.setVisible(true);
			}
		});
		
		
		btnBand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BandInsertion band = new BandInsertion();
				band.setVisible(true);
			}
		});
	
		
		
		btnConcert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConcertInsertion concert = new ConcertInsertion();
				concert.setVisible(true);
			}
		});
		
		
		btnAward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NominationInsertion nomination = new NominationInsertion();
				nomination.setVisible(true);
			}
		});
	
	
	}

}
