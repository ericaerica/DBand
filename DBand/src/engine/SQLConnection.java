package engine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQLConnection {

	private static SQLConnection currentConnection;

	private Connection con;
	private Statement st;
	private ResultSet rs;
	private ResultSetMetaData rsmd;

	private String url = "jdbc:postgresql://alcor.inf.unibz.it:5432/";
	private String user = "dbs_g05";
	private String password = "sirmamVu";

	/**
	 * Creates a connection to our specified DB.
	 */
	public SQLConnection() {
		SQLConnection.currentConnection = this;

		try {
			con = DriverManager.getConnection(url, user, password);
			st = ((java.sql.Connection) con).createStatement();
		} catch (SQLException ex) {
			Logger lgr = Logger.getLogger(SQLConnection.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);
		}
	}

	/**
	 * This method executes the query and returns a LinkedList whose first element
	 * is an array containing the names of the columns (String[]) and whose second
	 * element is an array of LinkedLists that contain each one the values of the 
	 * columns (LinkedList<String>[]).
	 * 
	 * @param query the query to be executed
	 * @return  LinkedList containing the titles and the contents
	 */
	@SuppressWarnings("unchecked")
	public LinkedList searchQuery(String query) {

		LinkedList tableInfo = new LinkedList();

		try {
			// Execute the query
			
			rs = st.executeQuery(query);
			rsmd = rs.getMetaData(); // Name of the columns

			// Get columns info and put them in an array
			int noOfCols = rsmd.getColumnCount();
			String[] colNames = new String[noOfCols];
			for (int i = 1; i <= noOfCols; i++) {
				colNames[i - 1] = rsmd.getColumnLabel(i);
			}

			// Get the content of the table
			LinkedList<String>[] contents = new LinkedList[noOfCols];
			for (int i = 0; i < contents.length; i++) {
				contents[i] = new LinkedList<String>();
			}
			while (rs.next()) {
				for (int i = 1; i <= noOfCols; i++) {
					String a = rs.getString(i);
					contents[i - 1].add(a);
				}
			}

			// Add the array with the column names and the array
			// With the contents to a LinkedList, to return it

			tableInfo.add(colNames);
			tableInfo.add(contents);

			
			 /* for (int j = 0; j < contents[0].size(); j++) { for (int i = 0; i
			  < contents.length; i++) { System.out.print(contents[i].get(j) + "\t"); } System.out.println(); }
			 */

		} catch (SQLException e) {
			rs = null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException ex) {
				Logger lgr = Logger.getLogger(SQLConnection.class.getName());
				lgr.log(Level.WARNING, ex.getMessage(), ex);
			}
		}
		return tableInfo;
	}

	
	/**
	 * This method executes a query (Delete, Update, Insert) 
	 * @param query the query to be executed
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	public String otherQuery(String query) {
		try {
			// Execute the query
			st.executeUpdate(query);
		} catch (SQLException e) {}
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException ex) {
				Logger lgr = Logger.getLogger(SQLConnection.class.getName());
				lgr.log(Level.WARNING, ex.getMessage(), ex);
			}
		}
		return query;
	}
	
	
	// ********************************************************
	// Getters and Setters

	public static SQLConnection getCurrentConnection() {
		return currentConnection;
	}

	public static void setCurrentConnection(SQLConnection currentConnection) {
		SQLConnection.currentConnection = currentConnection;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Statement getSt() {
		return st;
	}

	public void setSt(Statement st) {
		this.st = st;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public ResultSetMetaData getRsmd() {
		return rsmd;
	}

	public void setRsmd(ResultSetMetaData rsmd) {
		this.rsmd = rsmd;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
