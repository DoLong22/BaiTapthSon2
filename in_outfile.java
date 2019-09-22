package helloClass;
import java.util.*;
import java.io.*;
public class in_outfile {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("sv.inp"));
            SinhVien sinhVien = (SinhVien) ois.readObject();
            System.out.println(sinhVien.toString());
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }
}

class SinhVien implements  Serializable{
    private int masv;
    private String ten;
    private String lop;
    private double dtb;

    SinhVien() { }
    SinhVien(int masv, String ten, String lop, double dtb) {
        this.masv = masv;
        this.ten = ten;
        this.lop = lop;
        this.dtb = dtb;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    public int getMasv(){
        return this.masv;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public double getDtb() {
        return dtb;
    }

    @Override
    public String toString() {
        return masv+" "+ ten+" "+lop+" "+dtb;
    }
}
