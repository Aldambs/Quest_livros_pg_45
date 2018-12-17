/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg_45;

import java.util.Scanner;

public class Quest_05_ordemDecres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       System.out.println("DIGITE TRÊS NÚMEROS EM ORDEM CRESCENTE:");
       int num1 = ler.nextInt();
       int num2 = ler.nextInt();
       int num3 = ler.nextInt();
       System.out.println("DIGITE UM NÚMERO FORA DE ORDEM:");
       int num4 = ler.nextInt();
       if(num4 > num3){
           System.out.println("A ordem decrescente é: " +num4+ "-" +num3+ "-" +num2+ "-" +num1);
       }
       if(num4 > num2 & num4 < num3){
           System.out.println("A ordem decrescente é: " +num3+ "-" +num4+ "-" +num2+ "-" +num1);
       }
       if(num4 > num1 & num4 < num2){
           System.out.println("A ordem decrescente é: " +num3+ "-" +num2+ "-" +num4+ "-" +num1);
       }
       if(num4 > num1){
           System.out.println("A ordem decrescente é: " +num3+ "-" +num2+ "-" +num1+ "-" +num4);
       }
    }  
}
