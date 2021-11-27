/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Dev-StOrM
 * Created: Jul 28, 2021
 */

-- Create Database using MySQL
CREATE DATABASE QuanLy_SinhVien_PS15069;
USE QuanLy_SinhVien_PS15069;

-- Create tables
CREATE TABLE USERS (
    Username NVARCHAR(50) PRIMARY KEY,
    Password NVARCHAR(50),
    Role NVARCHAR(50)
);

INSERT INTO USERS 
    VALUES ("thanhoangloc", "gvcotamnhat", "Giảng viên"),
            ("tranthimychau", "daotao102", "Đào tạo"),
            ("teogv", "gv", "Giảng viên"),
            ("teodt", "dt", "Đào tạo");
            
SELECT * FROM USERS;

CREATE TABLE STUDENTS (
    MaSV NVARCHAR(50) PRIMARY KEY,
    HoTen NVARCHAR(50),
    Email NVARCHAR(50),
    SoDT NVARCHAR(15),
    GioiTinh bit,
    DiaChi NVARCHAR(50),
    Hinh BLOB,
    TiengAnh float,
    TinHoc float,
    GDTC float
);

INSERT INTO STUDENTS
    VALUES ("SV001", "Nguyễn Văn Tèo", "teonvsv001@gmail.com", "0902935187", true, "Bạc Liêu", LOAD_FILE("src\\Images\\SV001"), 10, 10, 10),
    ("SV002", "Lưu Sơn Vinh", "vinhlssv002@gmail.com", "0902996984", true, "An Giang", LOAD_FILE("src\\Images\\SV002"), 9.5, 8.5, 7),
    ("SV003", "Nguyễn Minh Thịnh", "thinhnmsv003@gmail.com", "0902913757", true, "TP. Hồ Chí Minh", LOAD_FILE("src\\Images\\SV003"), 9, 5.9, 9),
    ("SV004", "Huỳnh Kim Kiều Trinh", "trinhhkksv004@gmail.com", "0902936845", false, "Đà Nẵng", LOAD_FILE("src\\Images\\SV004"),8.5,9.8,6),
    ("SV005", "Lê Nguyễn Phương Nhi", "nhilnpsv005@gmail.com", "0902698691", false, "Bà Rịa - Vũng Tàu", LOAD_FILE("src\\Images\\SV005"),6.5,7.9,8),
    ("SV006", "Nguyễn Trần Thu Hằng", "hangnttsv006@gmail.com", "0902547854", false, "Phú Yên", LOAD_FILE("src\\Images\\SV006"),9.5,9,8),
    ("SV007", "Trương Văn Hoàn", "hoantvsv007@gmail.com", "0902930025", true, "TP. Hồ Chí Minh", LOAD_FILE("src\\Images\\SV007"),10,8.6,9),
    ("SV008", "Trần Thị Thảo Vân", "vantttsv008@gmail.com", "0902969699", false, "Đồng Nai", null,8.5,7.9,7),
    ("SV009", "Phan Tấn Phát", "phatptsv009@gmail.com", "0923512458", true, "Kiên Giang", null,7.5,6.4,9);


