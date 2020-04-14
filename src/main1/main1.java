/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;
import java.util.Scanner;
import BaiTap1.GiaoVien;
import BaiTap1.LopHoc;
import BaiTap1.
/**
 *
 * @author admin
 */
public class main1 {
        public static void main(String[] args) 
    {
        //Giao vien chu nhiem    
        GiaoVien gvcn = new GiaoVien();
        gvcn.setHoTen("Huynh Tuan Anh");
        gvcn.setTuoi();
        gvcn.setDiaChi();
        gvcn.setSdt();
        gvcn.setMonDay();
        gvcn.setToBoMon();

        //Tao lop voi giao vien chu nhiem
        LopHoc lopHoc = new LopHoc(gvcn);
        //tao lop hs
        HocSinh hs1 = new HocSinh();
        hs1.setHoTen("Dinh Tan Phuc");
        hs1.setTuoi(33);
        hs1.setDiaChi("Tuy Hòa");
        hs1.setSdt("012456789");
        hs1.setLop("CNTT2");
        hs1.setNangKhieu("Mua Roi");
        
        HocSinh hs2 = new HocSinh();
        hs2.setHoTen("Bui Xuan Huan");
        hs2.setTuoi(44);
        hs2.setDiaChi("Nha Trang");
        hs2.setSdt("2054605565");
        hs2.setLop("CNTT2");
        hs2.setNangKhieu("Noi Chuyen");
        
        HocSinh hs3 = new HocSinh();
        hs3.setHoTen("Ngo Ba Kha");
        hs3.setTuoi(44);
        hs3.setDiaChi("Khanh Hoa");
        hs3.setSdt("01645863546");
        hs3.setLop("CNTT2");
        hs3.setNangKhieu("Khung");
        
        //Tao them hoc sinh
        lopHoc.themHS(hs1);
        lopHoc.themHS(hs2);
        lopHoc.themHS(hs3);
        //Tao lop giao vien
        GiaoVien gv1 = new GiaoVien();
        gv1.setHoTen("Mai Phuong Thuy");
        gv1.setTuoi(18);
        gv1.setDiaChi("Quang Ngai");
        gv1.setSdt("0154789321");
        gv1.setMonDay("Toan");
        gv1.setToBoMon("Toan");
        
        GiaoVien gv2 = new GiaoVien();
        gv2.setHoTen("Tran Vu Huy");
        gv2.setTuoi(19);
        gv2.setDiaChi("Hung Yen");
        gv2.setSdt("0145356345");
        gv2.setMonDay("Ky Thuat Phan Mem");
        gv2.setToBoMon("Ky Thuat Phan Mem");
        
        GiaoVien gv3 = new GiaoVien();
        gv3.setHoTen("Dao Tuan Anh");
        gv3.setTuoi(90);
        gv3.setDiaChi("Phu Yen");
        gv3.setSdt("0145622523");
        gv3.setMonDay("Thiet Ke");
        gv3.setToBoMon("Ky Thuat Phan Mem");
        //them giao vien
        lopHoc.themGV(gv1);
        lopHoc.themGV(gv2);
        lopHoc.themGV(gv3);
        
        //In danh sach hoc sinh
        System.out.println("\nDanh sach hoc sinh:");
        lopHoc.inDSHS();
        //In danh sach giao vien
        System.out.println("\nDanh sach giao vien:");
        lopHoc.inDSGV();
    }
}
