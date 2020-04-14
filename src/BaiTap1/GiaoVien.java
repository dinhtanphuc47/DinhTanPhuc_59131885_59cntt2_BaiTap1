/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author admin
 */
public class GiaoVien extends CaNhan {
    
    private String monDay;
    private String toBoMon;
    
    public void setmonDay(String monDay)
    {
        this.monDay = monDay;
    }
    public void settoBoMon(String toBoMon)
    {
        this.toBoMon = toBoMon;
    }
    public String getmonDay()
    {
        return monDay;
    }
    public String gettoBoMon()
    {
        return toBoMon;
    }
    public GiaoVien()
    {
        super();
        this.monDay = "";
        this.toBoMon = "";
        
    }
    public  GiaoVien(String Hoten, int tuoi,  String diaChi, String sdt, String monday, String toBoMon)
    {
        this.hoTen = Hoten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.monDay = monday;
        this.toBoMon = toBoMon;
    }
    
    @Override
    public String HienThiTT() {
        System.out.println("THONG TIN:");
        System.out.println("Ho va ten :" + this.hoTen);
        System.out.println("Tuoi :" +this.tuoi);
        System.out.println("Dia chi:" + this.diaChi);
        System.out.println("So dien thoai: "+ this.sdt);
        System.out.println("Mon day: " + this.monDay);
        System.out.println("To bo mon: " + this.toBoMon);
        return "";
    }
}