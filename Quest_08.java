package pg_45;

import java.util.Scanner;

public class Quest_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Escolha uma das opções: ");
        System.out.println("---------------------------------------");
        System.out.println("1. Somar\n"
                + "2. Raiz quadrada");
        System.out.println("---------------------------------------");
        int op = ler.nextInt();
        System.out.println("=======================================");
        float num1, num2, soma;
        double valor, raiz;
        
        if(op == 1){
            System.out.print("Digite o 1º número: ");
            num1 = ler.nextFloat();
            System.out.print("Digite o 2º número: ");
            num2 = ler.nextFloat();
            soma = num1 + num2;
            System.out.println("A soma do 1º e 2º é = " +soma);
        }else{
            if(op == 2){
                System.out.print("Digite o valor: ");
                valor = ler.nextDouble();
                raiz = Math.sqrt(valor);
                System.out.println("A raiz quadrada é = " +raiz);
            }else{
                if(op != 1 && op != 2){
                    System.out.println("Opção inválida!");
                }
            }
        }
    }
    
}
