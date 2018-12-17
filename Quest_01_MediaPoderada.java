package pg_45;

import java.util.Scanner;

public class Quest_01_MediaPoderada {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota_trab, aval_sem, exame, media;
        System.out.println("DIGITE A NOTA DO TRABALHO EM LABORATÓRIO:");
        nota_trab = ler.nextFloat();
        System.out.println("DIGITE A NOTA DA AVALIAÇÃO SEMESTRAL:");
        aval_sem = ler.nextFloat();
        System.out.println("DIGITE A NOTA DO EXAME FINAL:");
        exame = ler.nextFloat();
        
        media = (nota_trab * 2 + aval_sem * 3 + exame * 5) / 10;
        System.out.println("Média Poderada: " +media);
        
        if(media >= 8 && media <= 10){
            System.out.println("OBTEVE CONCEITO A");
        }
        if(media >= 7 && media < 8){
            System.out.println("OBTEVE CONCEITO B");
        }
        if(media >= 6 && media < 7){
           System.out.println("OBTEVE CONCEITO C");
        }
        if(media >= 5 && media < 6){
           System.out.println("OBTEVE CONCEITO D");
        }
        if(media >= 0 && media < 5){
           System.out.println("OBTEVE CONCEITO E");
        }
    } 
}
