/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg_45;

import java.util.Scanner;

/**
 *
 * @author ALDA MATOS
 */
public class Quest_02_MediaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("DIGITE A PRIMEIRA NOTA:");
        float nota1 = ler.nextFloat();
        System.out.println("DIGITE A SEGUNDA NOTA:");
        float nota2 = ler.nextFloat();
        System.out.println("DIGITE A TERCEIRA NOTA:");
        float nota3 = ler.nextFloat();
        
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média aritmétrica é: " +media);
        if(media >= 0 && media < 3){
            System.out.println("REPROVADO!");
        }
        if(media >= 3 && media < 7){
            System.out.println("EXAME!");
            float nota_exame = 12 - media;
            System.out.println("Deve tirar nota " + nota_exame + " PARA SE APROVADO");
        }
        if(media >= 7 && media < 10){
            System.out.println("APROVADO!");
        }
    }
}
