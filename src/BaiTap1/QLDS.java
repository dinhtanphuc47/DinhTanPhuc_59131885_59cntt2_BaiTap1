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
public class QLDS implements IQLDS {
    private ArrayList<CaNhan> DsCN = new ArrayList<>();

    
    public ArrayList<CaNhan> getDs() 
    {
        return DsCN;
    }
    public void setDs(ArrayList<CaNhan> DsCN) 
    {
        this.DsCN = DsCN;
    }
   
    // them ca nhan
    @Override
    public int them(CaNhan cn) {
      DsCN.add(cn);
      return 1;
    }

    // xoa ca nhan
    @Override
    public int xoa(String ten) {
      if (DsCN.removeIf(cn -> cn.hoTen.equals(ten))) {
        return 1;
      }
      return 0;
    }

    // in ds ca nhan
    @Override
    public void inDS() {
      DsCN.forEach(cn -> System.out.println(cn.hienThiTT()));
    }

    void inDS(ArrayList<CaNhan> ds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}