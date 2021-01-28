package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection DBConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/supermarket";
		String username = "root";
		String password = "190030396";
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}