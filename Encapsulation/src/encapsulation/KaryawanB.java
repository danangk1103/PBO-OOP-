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
public class KaryawanB extends KaryawanA {
    @Override
    protected void setTunjangan(){
        if (this.masaKerja < 10){
            this.tunjangan = 3000000;
        } else {
            this.tunjangan = 4000000;
        }
    }
}
