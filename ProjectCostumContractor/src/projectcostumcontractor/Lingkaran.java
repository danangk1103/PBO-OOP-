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
public class Lingkaran {
    
    int jejari;
    
    Lingkaran(int a){
        this.jejari = a;
    }
    
    double hitungLuas(){
        return 3.14 * this.jejari * this.jejari;
    }
    
     double hitungKeliling(){
        return 2 * 3.14 * this.jejari;       
    }
}
