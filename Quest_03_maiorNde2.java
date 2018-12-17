package pg_45;

import java.util.Scanner;

public class Quest_03_maiorNde2 {
    /**
     * Faça um algoritmo para ler dois números inteiros e escrever o maior.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n1, n2;
        
        System.out.println("Qual é o primeiro valor?");
        n1 = ler.nextInt();
        System.out.println("Qual é o segundo valor?");
        n2 = ler.nextInt();
        
        if(n1 > n2){
            System.out.println("O maior número é:" +n1);
        }
        if(n2 > n1){
            System.out.println("O maior número é:" +n2);
        }
        if(n1 == n2){
            System.out.println("Os números são iguais!");
        }
    }
    
}
