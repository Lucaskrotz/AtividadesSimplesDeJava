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
public class Atividade08 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva o seu peso");
        int peso = entrada.nextInt();
        
        System.out.println("Escreva a sua altura");
        double altura = entrada.nextDouble();
        
        
        
        double soma = peso / Math.pow(altura, 2);
        
        if (soma <= 18.5){
        
            System.out.println("voce esta a baixo do peso");
        } else if(soma <= 25){
        
            System.out.println("Voce esta com o peso normal");
        } else if (soma <= 30){
        
            System.out.println("Voce esta acima do peso");
        } else if (soma >= 30){
        
            System.out.println("Voce esta obeso");
        } 
        
        
        
    } 
}
