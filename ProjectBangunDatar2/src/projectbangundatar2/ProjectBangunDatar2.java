/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author USER JPTK FKIP UNS
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        System.out.println("Luas persegi panjang pp1 = " + pp1.hitungLuas(10,5));
        
        PersegiPanjang pp2 = new PersegiPanjang();
        System.out.println("Luas persegi panjang pp2 = " + pp2.hitungLuas(3.6,8));
        
        PersegiPanjang pp3 = new PersegiPanjang();
        System.out.println("Luas persegi panjang pp3 = " + pp3.hitungLuas(6,8.3));
        
        PersegiPanjang pp4 = new PersegiPanjang();
        System.out.println("Luas persegi panjang pp4 = " + pp4.hitungLuas(5.6,8.8));
        
        System.out.println();
        
        System.out.println("Keliling persegi panjang pp1 = " + pp1.hitungKeliling(10,5));
        
        System.out.println("Keliling persegi panjang pp2 = " + pp2.hitungKeliling(3.6,8));
        
        System.out.println("Keliling persegi panjang pp3 = " + pp3.hitungKeliling(6,8.3));
        
        System.out.println("Keliling persegi panjang pp4 = " + pp4.hitungKeliling(5.6,8.8));
        
        System.out.println();
        
        Persegi p1 = new Persegi();
        System.out.println("Luas persegi p1 = " + p1.hitungLuas(4.5));
        
        Persegi p2 = new Persegi();
        System.out.println("Luas persegi p2 = " + p2.hitungLuas(7));
        
        System.out.println();
        
        System.out.println("Keliling persegi p1 = " + p1.hitungKeliling(4.5));
        
        System.out.println("Keliling persegi p2 = " + p1.hitungKeliling(7));
        
        System.out.println();
        
        Lingkaran l1 = new Lingkaran();
        System.out.println("Luas Lingkaran l1 = " + l1.hitungLuas(5));
        
        Lingkaran l2 = new Lingkaran();
        System.out.println("Luas Lingkaran l2 = " + l2.hitungLuas(7.4));
        
        System.out.println();
        
        System.out.println("Keliling Lingkaran l1 = " + l1.hitungKeliling(5));
        
        System.out.println("Keliling Lingkaran l2 = " + l2.hitungKeliling(7.4));
        
        System.out.println();
        
        Segitiga s1 = new Segitiga();
        System.out.println("Luas segitiga s1 = " + s1.hitungLuas(8,10));
        
        Segitiga s2 = new Segitiga();
        System.out.println("Luas segitiga s2 = " + s2.hitungLuas(8,11.5));
        
        Segitiga s3 = new Segitiga();
        System.out.println("Luas segitiga s3 = " + s3.hitungLuas(12.2,9));
        
        Segitiga s4 = new Segitiga();
        System.out.println("Luas segitiga s4 = " + s4.hitungLuas(13.9,20.7));
       
    }
    
}
