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
public class Quest_06_imparPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       System.out.println("DIGITE UM NÚMERO:");
       int num = ler.nextInt();
       
       if(num % 2 == 0){
           System.out.println("É par!");
       }else{
           System.out.println("É impar!");
       }
    } 
}
