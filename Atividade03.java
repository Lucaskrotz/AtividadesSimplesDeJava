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
public class Atividade03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int valorUm = entrada.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int valorDois = entrada.nextInt();
        
       if(valorUm == valorDois){
       
           int soma = valorUm + valorDois;
           
           System.out.println("A soma dos numeros iguais é :" + soma);
       } else {
       
       int multi = valorUm * valorDois;
       
           System.out.println("a multiplicação dos dois numero é:" + multi);
       
       }
       
        
    }
    
}
