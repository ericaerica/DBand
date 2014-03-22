package engine;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SQLConnection c = new SQLConnection();
		c.exeQuery("select * from musician");

	}

}
