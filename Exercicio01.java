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
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva o seu nome aqui: ");
        String nome = entrada.next();
        
        System.out.println("Escreva a sua idade aqui: ");
        int idade = entrada.nextInt();
        
        if(idade <= 15){
        
            System.out.println("Voce é uma criança: " + nome);
            
        } else if(idade <= 60){
        
        System.out.println("Voce é um adulto: " + nome);
        
        } else if(idade >= 60) {
        
        System.out.println("Voce é um idoso: " + nome);
            
        }
    }
}
