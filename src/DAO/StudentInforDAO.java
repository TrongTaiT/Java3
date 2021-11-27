/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBConnection;
import Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dev-StOrM
 */
public class StudentInforDAO {

    static public Student get(String maSV) {
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "SELECT MaSV, HoTen, Email, SoDT, GioiTinh, DiaChi, Hinh"
                    + " FROM STUDENTS WHERE MaSV=?";

            PreparedStatement preStm = connection.prepareStatement(sql);
            preStm.setString(1, maSV);
            ResultSet rs = preStm.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setMaSV(maSV);
                student.setHoTen(rs.getString("HoTen"));
                student.setEmail(rs.getString("Email"));
                student.setSoDT(rs.getString("SoDT"));
                student.setGioiTinh(rs.getBoolean("GioiTinh"));
                student.setDiaChi(rs.getString("DiaChi"));
                student.setHinh(rs.getBytes("Hinh"));
                return student;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    static public ArrayList getAll() {
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "SELECT MaSV, HoTen, Email, SoDT, GioiTinh, DiaChi, Hinh FROM STUDENTS";
            ArrayList<Student> students = new ArrayList<>();

            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student();
                student.setMaSV(rs.getString("MaSV"));
                student.setHoTen(rs.getString("HoTen"));
                student.setEmail(rs.getString("Email"));
                student.setSoDT(rs.getString("SoDT"));
                student.setGioiTinh(rs.getBoolean("GioiTinh"));
                student.setDiaChi(rs.getString("DiaChi"));
                student.setHinh(rs.getBytes("Hinh"));
                students.add(student);
            }
            return students;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    static public int save(Student student) {
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "INSERT INTO Students VALUES (?, ?, ?, ?, ?, ?, ?, null, null, null)";

            PreparedStatement preStm = connection.prepareStatement(sql);
            preStm.setString(1, student.getMaSV());
            preStm.setString(2, student.getHoTen());
            preStm.setString(3, student.getEmail());
            preStm.setString(4, student.getSoDT());
            preStm.setBoolean(5, student.getGioiTinh());
            preStm.setString(6, student.getDiaChi());
            preStm.setBytes(7, student.getHinh());

            return preStm.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }

    static public int update(Student student) {
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "UPDATE Students SET HoTen=?, Email=?, SoDT=?, GioiTinh=?, "
                    + "DiaChi=?, Hinh=? WHERE MaSV=?";

            PreparedStatement preStm = connection.prepareStatement(sql);
            preStm.setString(1, student.getHoTen());
            preStm.setString(2, student.getEmail());
            preStm.setString(3, student.getSoDT());
            preStm.setBoolean(4, student.getGioiTinh());
            preStm.setString(5, student.getDiaChi());
            preStm.setBytes(6, student.getHinh());
            preStm.setString(7, student.getMaSV());

            return preStm.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }

    static public int delete(String maSV) {
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "DELETE FROM Students WHERE MaSV=?";

            PreparedStatement preStm = connection.prepareStatement(sql);
            preStm.setString(1, maSV);

            return preStm.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }

        return 0;
    }
    
    static public String getHinh(String maSV) {
        String hinh = null;
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "SELECT Hinh FROM Students WHERE MaSV=?";

            PreparedStatement preStm = connection.prepareStatement(sql);
            preStm.setString(1, maSV);
            ResultSet rs = preStm.executeQuery();
            while (rs.next()) {
                hinh = rs.getString(1);
            }
            return hinh;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
        return "";
    }
    
    public static void main(String[] args) {
        System.out.println(StudentInforDAO.get("SV002").getHinh());
    }
}
