/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author Lenovo
 */
public abstract class Mobil {
    public abstract double hitungBensin();
    public void tampilHasil(){
        System.out.println("Jumlah liter bensin yang dibutuhkan adalah " + this.hitungBensin());
    }
}
