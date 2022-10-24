/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpengubinan;

/**
 *
 * @author danang
 */
public class Ruang {
    int panjang;
    int lebar;
    
    int hitungLuas(){
               
        // hitung luasnya
        return PersegiPanjang.perkalian(this.panjang, this.lebar);

    }
}
