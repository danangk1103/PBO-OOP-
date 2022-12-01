/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Lenovo
 */
public class Balok extends BangunRuang{
    public double panjang;
    public double lebar;
    public double tinggi;

    @Override
    public double hitungVolume(){
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luasPermukaan = (2 * this.panjang * this.lebar) + (2 * this.panjang * this.tinggi) + (2 * this.lebar * this.tinggi);
        return luasPermukaan;
        }
}
