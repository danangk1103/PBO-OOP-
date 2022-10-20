/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectarraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author USER JPTK FKIP UNS
 */
public class ClassRerataArrayList {
    int n;
    ArrayList<Integer> data = new ArrayList<Integer>();
    
    void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan n: ");
        this.n = input.nextInt();
        
        for (int i=0; i<this.n; i++){
            System.out.println("Masukkan data: ");
            data.add(input.nextInt());
        }
    }
    
    double hitungRerata(){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data.get(i);
        }
        
        double rerata = sum/this.n;
        return rerata;
    }
    
    void output(){
        System.out.println("Reratanya adalah: " + this.hitungRerata());
    }
}
