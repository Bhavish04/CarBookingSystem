package org.example.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/car_booking";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "bhavish";
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}