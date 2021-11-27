/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Dev-StOrM
 */
public class Student {

    private String maSV;
    private String hoTen;
    private String email;
    private String soDT;
    private boolean gioiTinh;
    private String diaChi;
    private byte[] hinh;
    private float tiengAnh;
    private float tinHoc;
    private float GDTC;

    public Student() {
    }

    // for StudentManagementForm
    public Student(String maSV, String hoTen, String email, String soDT, boolean gioiTinh, String diaChi, byte[] hinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.hinh = hinh;
    }

    // for GradeManagementForm
    public Student(String maSV, String hoTen, float tiengAnh, float tinHoc, float GDTC) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
    }

    public Student(String maSV, String hoTen, String email, String soDT, boolean gioiTinh, String diaChi, byte[] hinh, float tiengAnh, float tinHoc, float GDTC) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.hinh = hinh;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
    }

    // return formated value with only 1 decimal place
    public float getDTB() {
        float dtb = (tiengAnh + tinHoc + GDTC) / 3;
        String dtbString = String.format("%.1f", dtb);
        return Float.parseFloat(dtbString);
    }

    @Override
    public String toString() {
        return "[MaSV: " + maSV + ", HoTen: " + hoTen + ", Email: " + email
                + ", SoDT: " + soDT + ", GioiTinh: " + (gioiTinh ? "Nam" : "Nữ")
                + ", DiaChi: " + diaChi + ", TiengAnh: " + tiengAnh
                + ", TinHoc: " + tinHoc + ", GDTC: " + GDTC + "]";
    }

    // getters && setters
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public byte[] getHinh() {
        return hinh;
    }

    public void setHinh(byte[] hinh) {
        this.hinh = hinh;
    }

    public float getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(float tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public float getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(float tinHoc) {
        this.tinHoc = tinHoc;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }
}
