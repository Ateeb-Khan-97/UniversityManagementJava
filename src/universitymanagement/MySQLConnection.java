package universitymanagement;

import java.sql.*;

public class MySQLConnection {
	Connection con;
	Statement stmt;

	public MySQLConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/University?characterEncoding=latin1", "root",
					"ateeb");
			stmt = con.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}