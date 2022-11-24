/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author USER JPTK FKIP UNS
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setPanjang(50);
        pp1.setLebar(20);
        System.out.println("Luas persegi panjang yang panjangnya "+ pp1.getPanjang() +" dan lebarnya "+ pp1.getLebar() + " adalah " + pp1.hitungLuas());
        System.out.println("Luas persegi panjang yang panjangnya "+ pp1.getPanjang() +" dan lebarnya "+ pp1.getLebar() + " adalah " + pp1.hitungKeliling());
    }
    
}
