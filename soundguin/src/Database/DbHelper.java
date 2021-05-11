package Database;

import java.sql.*;

/**
 *
 * @author ahmet
 */
public class DbHelper {
    private String user = "root";
    private String password = "Aa7153";
    private String dbUrl = "jdbc:mysql://localhost:3306/soundguin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, user, password);
    }
}
