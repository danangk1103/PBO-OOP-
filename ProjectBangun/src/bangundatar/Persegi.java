/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author Lenovo
 */
public class Persegi extends BangunDatar {
    public double sisi;

    @Override
    public double hitungLuas(){
        double luas = this.sisi * this.sisi;
        return luas;
    }
    
    @Override
    public double hitungKeliling(){
        double keliling = 4 * this.sisi;
        return keliling;
    }
}


