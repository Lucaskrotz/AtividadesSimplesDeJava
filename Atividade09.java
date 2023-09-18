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
public class Atividade09 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual é o valor do produto: ");
        int produto = entrada.nextInt();
        
        System.out.println("Escolha como vc quer pagar esse produto: ");
        System.out.println(" A - Á vista em dinherio ou Cheque  "); 
        System.out.println(" C - vista no cartão de crédito   ");
        System.out.println(" X - Em duas vezes  ");
        System.out.println(" V - Em 10 vezes  ");
        String opcoes = entrada.next();
        
        if(opcoes.equalsIgnoreCase("A")){
        
            System.out.println("Voce escolheu a opcão a vista ou cheque: ");
            
            double pagamentoAvista = 0.10;
            
            double soma = produto - produto * pagamentoAvista;
            
            System.out.println("Voce recebeu desconto de 10%, o valor de pagamento ficou:  " + soma);
            
        
        } else if(opcoes.equalsIgnoreCase("C")){
        
        System.out.println("Voce escolheu pagar com cartao de credito: ");
            
            double pagamentoCartao = 0.15;
            
            double soma = produto - produto * pagamentoCartao;
            
            System.out.println("Voce recebeu desconto de 15%, o valor de pagamento ficou:  " + soma);
            
        
        } else if(opcoes.equalsIgnoreCase("X")){
        
        
            System.out.println("Voce pagara em 2 vezes ");
            
            double soma = produto / 2;
            
            System.out.println(" Sao duas ´parcelas de  " + soma + "R$" +" sem juros");
            
        } else if (opcoes.equalsIgnoreCase("V")){
        
            System.out.println(" Voce escolheu a opcao de parcelar em 10X");
            
            double soma = produto * 1.1 / 10;
            
            System.out.println("Ficou 10 parcelas de = " + soma + " R$, com o acrescimo de 10% juros");
        
        } else {
        
            System.out.println("Forma de pagamento inválida");
            
        }
        
    }
    
}
