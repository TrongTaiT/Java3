/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBConnection;
import Model.User;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dev-StOrM
 */

// https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html#executing_queries
public class UserDAO {

    static public User get(String username) {
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "SELECT * FROM Users WHERE username=?";

            PreparedStatement preStm = connection.prepareStatement(sql);
            preStm.setString(1, username);

            ResultSet rs = preStm.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUsername(username);
                u.setPassword(rs.getString("Password"));
                u.setRole(rs.getString("Role"));
                return u;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return null;
    }
    

}
