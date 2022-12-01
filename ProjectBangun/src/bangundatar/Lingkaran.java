/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author Lenovo
 */
public class Lingkaran extends BangunDatar {
    public double jejari;

    @Override
    public double hitungLuas(){
        double luas = 3.14 * this.jejari * this.jejari;
        return luas;
    }
    
    @Override
    public double hitungKeliling(){
        double keliling = 2 * 3.14 * this.jejari;
        return keliling;
    }
}
