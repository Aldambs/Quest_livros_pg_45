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
public class Quest_04_ordemCres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO NÚMERO:");
        int num1 = ler.nextInt();
        System.out.println("DIGITE O SEGUNDO NÚMERO:");
        int num2 = ler.nextInt();
        System.out.println("DIGITE O TERCEIRO NÚMERO:");
        int num3 = ler.nextInt();
        
        if(num1 < num2 & num1 < num3){
            if(num2< num3){
                System.out.println("A ordem é: " +num1+ "-" +num2+ "-" +num3);
            }else{
                System.out.println("A ordem é: " +num1+ "-" +num3+ "-" +num2);
            }
        }
        if(num2 < num1 & num2 < num3){
            if(num1 < num3){
                System.out.println("A ordem é: " +num2+ "-" +num1+ "-" +num3);
            }else{
                System.out.println("A ordem é: " +num2+ "-" +num3+ "-" +num1);
            }
        }
        if(num3 < num1 & num3 < num2){
            if(num1 < num2){
                System.out.println("A ordem é: " +num3+ "-" +num1+ "-" +num2);
            }else{
                System.out.println("A ordem é: " +num3+ "-" +num2+ "-" +num1);
            }
        }
        
    }
    
}
