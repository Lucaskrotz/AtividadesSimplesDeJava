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
public class atividade04 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva um valor:");
        int valor = entrada.nextInt();
        
        int soma = valor % 2;
        
        if(soma == 0 ){
            
           int valorSoma = valor + 5;
            
            System.out.println("O valor é par e foi acrescentado  " + valorSoma );
        } else {
          
            int valorSoma = valor + 8;
            
            System.out.println("O valor é par e foi acrescentado  " + valorSoma );
            
            
        } 
        
        
    }
    
}
