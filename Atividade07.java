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
public class Atividade07 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a sua altura: ") ;
        double altura = entrada.nextDouble();
        
        System.out.println("Digite o seu sexo ( M OU F ): ") ;
        String sexo = entrada.next();
        
        
        if(sexo.equalsIgnoreCase("M")){
        
            double somaM = (72.7 * altura) - 58;
            System.out.println("O peso do homen é de: " + somaM);
        } else if (sexo.equalsIgnoreCase("F")){
        
            double somaF = (62.1 * altura) - 44.7;
            System.out.println("O peso da mulher é de: " + somaF);
            
        } 
         
    }
    
}
