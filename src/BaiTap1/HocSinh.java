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
public class HocSinh extends CaNhan {
    // attributes
    private String lop;
    private String nangKhieu;

    // contructor
    // no params
    public HocSinh() {
      super();
      this.lop = "";
      this.nangKhieu = "";
    }
    // with params
    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
      super(hoTen, tuoi, diaChi, sdt);
      this.lop = lop;
      this.nangKhieu = nangKhieu;
    }

    // getter, setter
    public void setLop(String lop) { this.lop = lop; }
    public void setNangKhieu(String nangKhieu) { this.nangKhieu = nangKhieu; }
    public String getLop() { return this.lop; }
    public String getNangKhieu() { return this.nangKhieu; }

    // hien thi thong tin
    @Override
    public String hienThiTT() {
      String ThongTin = "";
      ThongTin = "ho ten: " + this.hoTen + ", tuoi: " + this.tuoi + ", dia chi: " + this.diaChi
        + ", sdt: " + this.sdt + ", lop: " + this.lop + ", nang khieu: " + this.nangKhieu;

//      System.out.println(thongTin);
      return ThongTin;
    }
}