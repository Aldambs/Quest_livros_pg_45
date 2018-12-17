package pg_45;

import java.util.Scanner;

public class Quest_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c, i;
        System.out.println("DIGITE UM VALOR PARA A:");
        a = ler.nextInt();
        System.out.println("DIGITE UM VALOR PARA B:");
        b = ler.nextInt();
        System.out.println("DIGITE UM VALOR PARA C:");
        c = ler.nextInt();
        System.out.println("DIGITE UM VALOR PARA I(1, 2 OU 3):");
        i = ler.nextInt();
        
        if(i == 1){
            if(a < b & a < c){
                if(b < a){
                    System.out.println("A ordem crescente dos números é: " +a+ "-" +b+ "-" +c);
                }else{
                    System.out.println("A ordem crescente dos números é: " +a+ "-" +c+ "-" +b);
                }
            }
            if(b < a & b < c){
                if(a < c){
                    System.out.println("A ordem crescente dos números é: " +b+ "-" +a+ "-" +c);
                }else{
                    System.out.println("A ordem crescente dos números é: " +b+ "-" +c+ "-" +a);
                }
            }
            if(c < a & c < b){
                if(a < b){
                    System.out.println("A ordem crescente dos números é: " +c+ "-" +a+ "-" +c);
                }else{
                    System.out.println("A ordem crescente dos números é: " +c+ "-" +b+ "-" +a);
                }
            }      
        }
        if(i == 2){
            if(a > b & a > c){
                if(b > a){
                    System.out.println("A ordem crescente dos números é: " +a+ "-" +b+ "-" +c);
                }else{
                    System.out.println("A ordem crescente dos números é: " +a+ "-" +c+ "-" +b);
                }
            }
            if(b > a & b > c){
                if(a > c){
                    System.out.println("A ordem crescente dos números é: " +b+ "-" +a+ "-" +c);
                }else{
                    System.out.println("A ordem crescente dos números é: " +b+ "-" +c+ "-" +a);
                }
            }
            if(c > a & c > b){
                if(a > b){
                    System.out.println("A ordem crescente dos números é: " +c+ "-" +a+ "-" +c);
                }else{
                    System.out.println("A ordem crescente dos números é: " +c+ "-" +b+ "-" +a);
                }
            }      
        }
        if(i == 3){
           if(a > b & a > c){
               System.out.println("A ordem desejada é: " +b+ "-" +a+ "-" +c);
           }
           if(b > a & b > c){
               System.out.println("A ordem desejada é: " +a+ "-" +b+ "-" +c);
           }
           if(c > a & c > b){
               System.out.println("A ordem desejada é: " +a+ "-" +c+ "-" +b);
           }
        }
    }   
}
