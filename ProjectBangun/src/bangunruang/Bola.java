/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Lenovo
 */
public class Bola extends BangunRuang{
    public double jejari;
    public double tinggi;

    @Override
    public double hitungVolume(){
        double volume = 4 * 3.14 * this.jejari * this.jejari;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luasPermukaan = (4/3) * 3.14 * this.jejari * this.jejari * this.jejari;
        return luasPermukaan;
    }
}
