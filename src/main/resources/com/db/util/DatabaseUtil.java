package com.db.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
   static Connection con = null;
    public static Connection getConnection()  {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/sampledb", "root", "gamer4life");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
