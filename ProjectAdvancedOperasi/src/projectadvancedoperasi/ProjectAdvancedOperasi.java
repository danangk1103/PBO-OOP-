/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author USER JPTK FKIP UNS
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi A = new Operasi();
        System.out.println("Hasil dari penjumlahan 3 + 4 = " + A.jumlahkan(3,4));
        
        Operasi B = new Operasi();
        System.out.println("Hasil dari penjumlahan 4 + 7 + (-9) = " + B.jumlahkan(4,7,-9));
        
        Operasi C = new Operasi();
        System.out.println("Hasil dari penjumlahan 3.4 + (-0.002) + 0.12313 = " + C.jumlahkan(3.4,-0.002,0.12313));
        
        System.out.println("");
        
        Operasi D = new Operasi();
        System.out.println("Hasil dari perkalian 3 * 4 = " + D.kalikan(3,4));
        
        Operasi E = new Operasi();
        System.out.println("Hasil dari perkalian 4 * 7 * (-9) = " + E.kalikan(4,7,-9));
        
        Operasi F = new Operasi();
        System.out.println("Hasil dari perkalian 3.4 * (-0.002) * 0.12313 = " + F.kalikan(3.4,-0.002,0.12313));
    }
    
}
