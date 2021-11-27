/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Connection.DBConnection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.*;
import org.apache.ibatis.jdbc.ScriptRunner;

/**
 *
 * @author Dev-StOrM
 */
public class AutoCreateDatabase {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/sys";
            String username = "root";
            String password = "zxc123";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            
            ScriptRunner scriptRunner = new ScriptRunner(connection);
            Reader reader = new BufferedReader(new FileReader("src\\Database\\QuanLy_SinhVien.sql"));
            scriptRunner.runScript(reader);            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
