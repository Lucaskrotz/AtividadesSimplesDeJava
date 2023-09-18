/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeatividade02;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Atividade06 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva o primeiro valor: ");
        int  a = entrada.nextInt();
        System.out.println("Escreva o primeiro valor: ");
        int  b = entrada.nextInt();
        System.out.println("Escreva o primeiro valor: ");
        int  c = entrada.nextInt();
        
        if(a > b && b > c ){
        
            System.out.println("a ordem é " + a + "," + b + "," +  c);
            
        } else if(a > c && c > b){
        
            System.out.println("a ordem é " + a + "," + c + "," +  b);
            
        }else if(b > a && a > c){
        
            System.out.println("a ordem é " + b + "," + a + "," +  c);
            
        }else if(b > c && c > a){
        
            System.out.println("a ordem é " + b + "," + c + "," +  a);
            
        }else if(c > a && a > b){
        
            System.out.println("a ordem é " + c + "," + a + "," +  b);
            
        }else if(c > b && b > a){
        
            System.out.println("a ordem é " + c + "," + b + "," +  a);
            
        }
    }
    
}
