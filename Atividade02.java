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
public class Atividade02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva um valor :");
        int valor = entrada.nextInt();
       
        int valorImpPar = valor % 2;
        
        if(valorImpPar == 0 ){
        
        System.out.println(" o valor é par");
        } else {
        
        System.out.println("o valor é impar");
        }
    }
}
