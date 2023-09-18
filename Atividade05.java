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
public class Atividade05 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva um numero");
        int numero = entrada.nextInt();
        
        if(numero >= 0 ){
        
            int multi = numero * 2;
            
            System.out.println("O numero é possitivo e foi multiplicado " + multi);
        } else {
        
            int triplo = numero * 3;
            
            System.out.println("O numero é negativo e foi Triplicado " + triplo);
        }
        
    }
}
