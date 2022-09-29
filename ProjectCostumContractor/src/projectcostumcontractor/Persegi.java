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
public class Persegi {
    
    int sisi;
    
    Persegi(int a){
        this.sisi = a;
    }

    int hitungLuas(){
        return this.sisi * this.sisi;
    }
    
     int hitungKeliling(){
        return 4 * this.sisi;
        
    }
}
