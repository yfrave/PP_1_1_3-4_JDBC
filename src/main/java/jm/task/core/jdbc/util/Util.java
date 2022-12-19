package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/usersdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Не удалось загрузить драйвер.");
        }
        return connection;
    }

    public static void close (Connection connection){
        if (connection != null){
            try {
                connection.close();
                System.out.println("Соединение закрыто.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}