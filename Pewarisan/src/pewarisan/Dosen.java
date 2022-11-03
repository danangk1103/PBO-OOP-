/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author USER JPTK FKIP UNS
 */
public class Dosen extends Pegawai{
    String nidn;
    
    Pegawai coba1 = new Pegawai();
    Dosen coba = new Dosen();
    
    void display(){
        System.out.println("Hasil:"+coba.hitungGajiPokok());
    }
    
}
