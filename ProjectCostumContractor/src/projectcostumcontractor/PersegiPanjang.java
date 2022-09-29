/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcostumcontractor;

/**
 *
 * @author USER JPTK FKIP UNS
 */
public class PersegiPanjang {
    
    int panjang;
    int lebar;

    
    PersegiPanjang(int a, int b){
        this.panjang = a;
        this.lebar = b;
    }
    
    int hitungLuas(){
        return this.panjang * this.lebar;
    }
    
     int hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
        
    }
        
}
