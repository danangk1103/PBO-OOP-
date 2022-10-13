/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratarata;
import java.util.Scanner;
/**
 *
 * @author USER JPTK FKIP UNS
 */
public class Rerata {
    double rerata;
    double sum = 0;
    int n =0;
    void inputData(){
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Masukkan bilangan: ");
            int bil = input.nextInt();
            sum += bil;
            n++;
            System.out.println("Mau input lagi? y/n");
            char ans = input.next().charAt(0);
            if (ans == 'n'){
                break;
            }
        }
    }
    
    void hitungRerata(){
        this.rerata = this.sum/this.n;
        System.out.println("Rata-ratanya : " + rerata);
        System.out.println("Yeay bisa");
    }
}
