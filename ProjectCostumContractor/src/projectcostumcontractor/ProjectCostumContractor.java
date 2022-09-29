/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcostumcontractor;

/**
 *
 * @author USER JPTK FKIP UNS
 */
public class ProjectCostumContractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang(10, 15);
        PersegiPanjang pp2 = new PersegiPanjang(7, 3);
        Persegi p1 = new Persegi(10);
        Persegi p2 = new Persegi(7);
        Lingkaran l1 = new Lingkaran(10);
        Lingkaran l2 = new Lingkaran(7);
        Segitiga s1 = new Segitiga(10, 15);
        Segitiga s2 = new Segitiga(7, 3);
        System.out.println("Luas Persegi Panjang pp1 : " + pp1.hitungLuas());
        System.out.println("Keliling Persegi Panjang pp1 : " + pp1.hitungKeliling());
        System.out.println("Luas Persegi Panjang pp2 : " + pp2.hitungLuas());
        System.out.println("Keliling Persegi Panjang pp2 : " + pp2.hitungKeliling());
        System.out.println("");
        System.out.println("Luas Persegi pp1 : " + p1.hitungLuas());
        System.out.println("Keliling Persegi pp1 : " + p1.hitungKeliling());
        System.out.println("Luas Persegi pp2 : " + p2.hitungLuas());
        System.out.println("Keliling Persegi pp2 : " + p2.hitungKeliling());
        System.out.println("");
        System.out.println("Luas Lingkaran l1 : " + l1.hitungLuas());
        System.out.println("Keliling Lingkaran l1 : " + l1.hitungKeliling());
        System.out.println("Luas Lingkaran l2 : " + l2.hitungLuas());
        System.out.println("Keliling Lingkaran l2 : " + l2.hitungKeliling());
        System.out.println("");
        System.out.println("Luas Segitiga s1 : " + s1.hitungLuas());
        System.out.println("Luas Segitiga s2 : " + s2.hitungLuas());
        
    }
    
}
