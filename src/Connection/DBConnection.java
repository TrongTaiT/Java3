/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;

/**
 *
 * @author Dev-StOrM
 */
public class DBConnection {

    static public Connection getDBConnection() {
        final String url = "jdbc:mysql://localhost:3306/QuanLy_SinhVien";
        final String username = "root";
        final String password = "zxc123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return null;
    }

    public static void main(String[] args) {
        Connection connection = getDBConnection();
        if (connection != null) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }
    }
}
