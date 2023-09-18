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
public class Atividade10 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe seu numero:");
        int numero = entrada.nextInt();
        
        System.out.println("Escreva a primeira nota, aluno = " + numero);
        int notaUm = entrada.nextInt();
        
        System.out.println("Escreva a segunda nota, aluno = " + numero);
        int notaDois = entrada.nextInt();
        
        System.out.println("Escreva a segunda nota, aluno = " + numero);
        int notaTres = entrada.nextInt();
        
        System.out.println("Escreva o valor da media dos exercicios, aluno = " + numero );
        int mE = entrada.nextInt();
        
        double mA = (notaUm + notaDois * 2 + notaTres * 3 + mE) / 7; 
        
        if(mA >= 90){
        
            System.out.println("Voce recebeu a nota - A ");
            System.out.println("Voce foi aprovado");
        
        } else if (mA >= 75 ){
        
           System.out.println("Voce recebeu a nota - B ");
            System.out.println("Voce foi aprovado"); 
            
        } else if (mA >= 60){
        
            System.out.println("Voce recebeu a nota - C ");
            System.out.println("Voce foi aprovado");
        
        } else if (mA <= 60){
        
            System.out.println("Voce recebeu a nota - D ");
            System.out.println("Voce foi Reprovado");
            
        } else if (mA <= 40 ){
        
            System.out.println("Voce recebeu a nota - E ");
            System.out.println("Voce foi Reprovado");
        
        }
        
            System.out.println("A media da sua nota foi de "+ mA);
    }
    
}
