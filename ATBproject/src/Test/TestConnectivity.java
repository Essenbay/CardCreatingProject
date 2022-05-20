package Test;

import Database.ConnectionData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class TestConnectivity {
    private static final String CREATE_TABLE_QUERY =
            "CREATE TABLE test "
                    + "(id INT(5) NOT NULL AUTO_INCREMENT,"
                    + "PRIMARY KEY(id));";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(ConnectionData.URL, ConnectionData.USER, ConnectionData.PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE_QUERY);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
