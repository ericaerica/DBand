package mainGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Search extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Search() {
		setTitle("Information Retrieval");
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
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "All info related to a Band", "All info related to a Genre", "All info related to a Record Label", "All info related to the Awards", "All info related to the Musicians"}));
		comboBox.setBounds(30, 84, 302, 20);
		contentPane.add(comboBox);
	
	//************************************* Action Listener **************************************
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JComboBox<String> combo = (JComboBox<String>)e.getSource();
				String currentSelection = (String)combo.getSelectedItem();
				
				switch (currentSelection)
				{    
				    case "All info related to a Band":
				    	
				    	System.out.println("Band");
				        
				    	break;
				    case "All info related to a Genre":
				    	
				    	System.out.println("Genre");
				        
				    	break;
				    case "All info related to a Record Label":
				    	
				    	System.out.println("RL");
				        
				    	break;
				    case "All info related to the Awards":
				    	
				    	System.out.println("Awards");
				    	
				        break;
				    case "All info related to the Musicians":
				    	
				    	System.out.println("Musicians");
				        
				    	break;
				   	   
				    default:
				    	currentSelection = "";
				        break;
				}
				
				
            }
		});
	
	}

}
