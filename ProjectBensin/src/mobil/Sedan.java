/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author Lenovo
 */
public class Sedan extends Mobil {
    public double jarakPerLiter = 10;
    public double jarakKeTujuan;
    
    @Override
    public double hitungBensin(){
        double jumlahBensin = this.jarakKeTujuan / this.jarakPerLiter;
        return jumlahBensin;
    }
}
