package pg_45;

import java.util.Scanner;

public class Quest_10 {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         int d1, d2, m1, m2, a1, a2;
         System.out.println("Digite a 1º data: ");
         System.out.println("Dia: ");
         d1 = ler.nextInt();
         System.out.println("Mês: ");
         m1 = ler.nextInt();
         System.out.println("ano: ");
         a1 = ler.nextInt();
         System.out.println("Digite a 2º data: ");
         System.out.println("Dia: ");
         d2 = ler.nextInt();
         System.out.println("Mês: ");
         m2 = ler.nextInt();
         System.out.println("Ano: ");
         a2 = ler.nextInt();
         if(a1>a2){
             System.out.println("A maior data é: " +d1+ "/" +m1+ "/" +a1);
         }else 
             if(a2>a1){
                System.out.println("A maior data é: " +d2+ "/" +m2+ "/" +a2);
            }else 
                if(m1>m2){
                    System.out.println("A maior data é: " +d1+ "/" +m1+ "/" +a1);
                }else 
                    if(m2>m1){
                        System.out.println("A maior data é: " +d2+ "/" +m2+ "/" +a2);
                    }else
                        if(d1>d2){
                            System.out.println("A maior data é: " +d1+ "/" +m1+ "/" +a1);
                        }else
                            if(d2>d1){
                            System.out.println("A maior data é: " +d2+ "/" +m2+ "/" +a2);
                        }else{
                                System.out.println("Datas iguais!");
                        }
    }
    
}
