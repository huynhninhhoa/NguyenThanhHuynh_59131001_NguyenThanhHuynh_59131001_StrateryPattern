/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Administrator
 */
//Nguyễn Thành Huynh 5913 1001
public class Main_BaiTap1 {
    public static void main(String[] args) {
        context ct = new context();
    
        ct.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + ct.tinh(75, 12));
        
        ct.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + ct.tinh(54, 78));
        
        //ct.setTinhToan(new Nhan());
        //System.out.println("75 * 12 = " + ct.tinh(75, 12));
        
        //ct.setTinhToan(new Chia());
        //System.out.println("54 / 78 = " + ct.tinh(54, 78));
    }
    
    
}
