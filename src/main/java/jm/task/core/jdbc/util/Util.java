package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/usersdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Rt56g399jop888";
    Connection connection1;

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Не удалось загрузить драйвер.");
        }
        return connection;
    }
}