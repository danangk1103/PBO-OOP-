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
public class Segitiga {
    
    int alas;
    int tinggi;
  
    Segitiga(int a, int b){
        this.alas = a;
        this.tinggi = b;
    }
    
    int hitungLuas(){
        return this.alas * this.tinggi / 2;
    }
    
}
