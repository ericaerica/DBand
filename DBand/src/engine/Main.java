package engine;

import mainGUI.MainGUI;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SQLConnection c = new SQLConnection();
		MainGUI frame = new MainGUI();
		frame.setVisible(true);
		
		//c.searchQuery("select * from band");

	}

}
