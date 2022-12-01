/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangun;

import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;

/**
 *
 * @author Lenovo
 */
public class MainClass {
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        p1.sisi = 10;
        System.out.println("Persegi:");
        p1.tampilHasil();
        
        System.out.println("");
        
        Lingkaran l1 = new Lingkaran();
        l1.jejari = 100;
        System.out.println("Lingkaran:");
        l1.tampilHasil();
        
        System.out.println("");
        
        Balok blk1 = new Balok();
        blk1.panjang = 100;
        blk1.lebar = 50;
        blk1.tinggi= 40;
        System.out.println("Balok:");
        blk1.tampilHasil();
        
        System.out.println("");
        
        Tabung tb1 = new Tabung();
        tb1.jejari = 10;
        tb1.tinggi= 40;
        System.out.println("Tabung:");
        tb1.tampilHasil();
        
        System.out.println("");
        
        Bola bl1 = new Bola();
        bl1.jejari = 25;
        System.out.println("Bola:");
        bl1.tampilHasil();
    }
}
