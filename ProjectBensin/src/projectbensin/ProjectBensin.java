/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbensin;

import mobil.MPV;
import mobil.SUV;
import mobil.Sedan;

/**
 *
 * @author Lenovo
 */
public class ProjectBensin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sedan => Solo - Kudus:");
        Sedan sd1 = new Sedan();
        sd1.jarakKeTujuan = 163.5;
        sd1.tampilHasil();
        
        System.out.println("");
        
        System.out.println("Sedan => Solo - Jakarta:");
        Sedan sd2 = new Sedan();
        sd2.jarakKeTujuan = 536.1;
        sd2.tampilHasil();
        
        System.out.println("");
        
        System.out.println("SUV => Solo - BantenL:");
        SUV su1 = new SUV();
        su1.jarakKeTujuan = 660.5;
        su1.tampilHasil();
        
        System.out.println("");
        
        System.out.println("SUV => Solo - Bandung:");
        SUV su2 = new SUV();
        su2.jarakKeTujuan = 531.9;
        su2.tampilHasil();
        
        System.out.println("");
        
        System.out.println("MPV => Solo - Banyuwangi:");
        MPV mp1 = new MPV();
        mp1.jarakKeTujuan = 544.4;
        mp1.tampilHasil();
        
        System.out.println("");
        
        System.out.println("MPV => Solo - Jember:");
        MPV mp2 = new MPV();
        mp2.jarakKeTujuan = 436.4;
        mp2.tampilHasil();
    }
    
}
