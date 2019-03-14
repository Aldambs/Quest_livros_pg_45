package pg_45;

import java.util.Scanner;

public class Quest_14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double sal, novoSal, boni = 0, aux = 0;
        System.out.println("Digite o salário do funcionário: ");
        sal = ler.nextDouble();
        if(sal <= 500){
            boni = sal * 0.05;
        }
        if((sal > 500) && (sal <= 1200)){
            boni = sal * 0.12;
        }
        if(sal > 1200){
            boni = 0;
        }
        if(sal <= 600){
            aux = 150;
        }
        if(sal > 600){
            aux = 100;
        }
        novoSal = sal + boni + aux;
        System.out.println("O novo salário é: " +novoSal);
    }
    
}
