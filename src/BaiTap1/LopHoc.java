/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;
import interfacee.IQLDS;
import java.util.ArrayList;
/**
 *
 * @author admin
 */
public class LopHoc {
    private QLDS DSHS = new QLDS();
    private QLDS DSGV = new QLDS();

    
   public int themHS(HocSinh hocSinh){
       DSGV.them( hocSinh);
       return 1;
   }
   public int inDSHS(){
      DSGV.inDS(DSGV.getDs());
      return 1;
   }

   
    public int themGV(GiaoVien giaoVien){
        DSGV.them( giaoVien);
        return 1;
    }
    public int  inDSGV(){
        DSGV.inDS(DSGV.getDs());
        return 1;
    }
}