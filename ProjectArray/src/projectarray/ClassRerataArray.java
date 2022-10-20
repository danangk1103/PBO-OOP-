/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectarray;

import java.util.Scanner;

/**
 *
 * @author USER JPTK FKIP UNS
 */
public class ClassRerataArray {
        int n;
    int[] data = new int[10];
    
    void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan n: ");
        this.n = input.nextInt();
        
        for (int i=0; i<this.n; i++){
            System.out.println("Masukkan data: ");
            this.data[i] = input.nextInt();
        }
    }
    
    double hitungRerata(){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += this.data[i];
        }
        
        double rerata = sum/this.n;
        return rerata;
    }
    
    void output(){
        System.out.println("Reratanya adalah: " + this.hitungRerata());
    }
}
