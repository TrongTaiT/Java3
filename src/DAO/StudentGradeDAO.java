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
public class StudentGradeDAO {

    static public Student get(String maSV) {
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "SELECT HoTen, TiengAnh, TinHoc, GDTC"
                    + " FROM STUDENTS WHERE MaSV=?";

            PreparedStatement preStm = connection.prepareStatement(sql);
            preStm.setString(1, maSV);
            ResultSet rs = preStm.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setMaSV(maSV);
                student.setHoTen(rs.getString("HoTen"));
                student.setTiengAnh(rs.getFloat("TiengAnh"));
                student.setTinHoc(rs.getFloat("TinHoc"));
                student.setGDTC(rs.getFloat("GDTC"));
                return student;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    static public ArrayList getSimilar(String maSV) {
        String sql = "SELECT HoTen, TiengAnh, TinHoc, GDTC FROM STUDENTS WHERE MaSV like ?";
        try (Connection connection = DBConnection.getDBConnection()) {
            ArrayList<Student> students = new ArrayList<>();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student();
                student.setMaSV(rs.getString("MaSV"));
                student.setHoTen(rs.getString("HoTen"));
                student.setTiengAnh(rs.getFloat("TiengAnh"));
                student.setTinHoc(rs.getFloat("TinHoc"));
                student.setGDTC(rs.getFloat("GDTC"));
                students.add(student);
            }
            return students;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    static public ArrayList getAll() {
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "SELECT MaSV, HoTen, TiengAnh, TinHoc, GDTC FROM STUDENTS";
            ArrayList<Student> students = new ArrayList<>();

            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student();
                student.setMaSV(rs.getString("MaSV"));
                student.setHoTen(rs.getString("HoTen"));
                student.setTiengAnh(rs.getFloat("TiengAnh"));
                student.setTinHoc(rs.getFloat("TinHoc"));
                student.setGDTC(rs.getFloat("GDTC"));
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
            String sql = "UPDATE Students SET TiengAnh=?, TinHoc=?, GDTC=?"
                    + " WHERE MaSV=?";

            PreparedStatement preStm = connection.prepareStatement(sql);
            preStm.setFloat(1, student.getTiengAnh());
            preStm.setFloat(2, student.getTinHoc());
            preStm.setFloat(3, student.getGDTC());
            preStm.setString(4, student.getMaSV());

            return preStm.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }

    static public int update(Student student) {
        return save(student);
    }

    static public int delete(String maSV) {
        try (Connection connection = DBConnection.getDBConnection()) {
            String sql = "UPDATE Students SET TiengAnh=null, TinHoc=null, GDTC=null"
                    + " WHERE MaSV=?";

            PreparedStatement preStm = connection.prepareStatement(sql);
            preStm.setString(1, maSV);

            return preStm.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }

        return 0;
    }

//    public static void main(String[] args) {
////        System.out.println(get("SV001"));
////        getAll().forEach(System.out::println);
//        
////        Student s = get("SV001");
////        s.setTiengAnh(7);
////        save(s);
//        getAll().forEach(System.out::println);
//    }
}
