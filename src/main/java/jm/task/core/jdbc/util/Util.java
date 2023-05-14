package jm.task.core.jdbc.util;

import com.sun.xml.bind.v2.runtime.Coordinator;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    public static final String URL = "jdbc:mysql://localhost:3306/testDB";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "rootroot";
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
