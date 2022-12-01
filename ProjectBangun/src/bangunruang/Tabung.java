/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Lenovo
 */
public class Tabung extends BangunRuang{
    public double jejari;
    public double tinggi;

    @Override
    public double hitungVolume(){
        double volume = 3.14 * this.jejari * this.jejari * this.tinggi;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luasPermukaan = 2 * 3.14 * this.jejari * (this.jejari + this.tinggi);
        return luasPermukaan;
    }
}
