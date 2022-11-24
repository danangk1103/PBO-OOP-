/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author USER JPTK FKIP UNS
 */
public class KaryawanA {
    String nik;
    String nama;
    protected int masaKerja;
    protected int gapok = 3000000;
    protected int tunjangan;
    protected int totalGaji;
    
    void setMasaKerja(int mk){
        if (mk > 0) {
            this.masaKerja = mk;
        } else {
            System.out.println("Masa kerja tidak valid");
            System.exit(0);
        }
    }
    
    protected void setTunjangan(){
        if (this.masaKerja < 10){
            this.tunjangan = 2000000;
        } else {
            this.tunjangan = 3000000;
        }
    }   
    
    void totalGaji(){
        this.totalGaji = this.gapok + this.tunjangan;
    }   
    
    void printStrukGaji(){
        this.setTunjangan();
        this.totalGaji();
        System.out.println("NIK           : " + this.nik);
        System.out.println("Nama          : " + this.nama);
        System.out.println("========================");
        System.out.println("Gaji pokok    : " + this.gapok);
        System.out.println("Tunjangan     : " + this.tunjangan);
        System.out.println("========================");
        System.out.println("Total gaji    : " + this.totalGaji);
    }
}
