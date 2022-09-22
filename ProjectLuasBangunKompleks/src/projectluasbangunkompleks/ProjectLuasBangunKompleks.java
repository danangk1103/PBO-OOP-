/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectluasbangunkompleks;

/**
 *
 * @author danang
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Project 1
        
        //Hitung luas seluruh setengah lingkaran
        Lingkaran L1 = new Lingkaran();
        double totalLuasLingkaran1 = L1.hitungLuas2(21) * 4;
        
        //Hitung luas persegi
        Persegi P1 = new Persegi();
        int totalLuasPersegi1 = P1.hitungLuas(42);
        
        //Hitung Luas total
        double luasTotal1 = totalLuasPersegi1 + totalLuasLingkaran1;
        System.out.println("Luas total bangun project 1 adalah : " + luasTotal1 + " cm^2");
        
        //Project 2
        
        //Hitung luas lingkaran besar
        Lingkaran LB = new Lingkaran();
        double totalLuasLingkaranB = LB.hitungLuas2(14);
        
        //Hitung luas seluruh lingkaran kecil
        Lingkaran Lk = new Lingkaran();
        double totalLuasLingkarank = Lk.hitungLuas2(7) * 2;
        
        //Hitung Luas total
        double luasTotal2 = totalLuasLingkaranB - totalLuasLingkarank;
        System.out.println("Luas total bangun project 2 adalah : " + luasTotal2 + " cm^2");
    }
    
}
