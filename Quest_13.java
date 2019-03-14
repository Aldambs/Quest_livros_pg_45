package pg_45;

import java.util.Scanner;

public class Quest_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double imp = 0, sal, aum = 0, novoSal;
        int op;
        do{
            System.out.println("Digite a opção desejada:\n"
                    + "1.Imposto\n"
                    + "2.Novo salário\n"
                    + "3.Classificação\n"
                    + "0.Sair");
            op = ler.nextInt();
            switch(op){
                case 1:
                    System.out.println("Qual o salário do funcionário: ");
                    sal = ler.nextDouble();
                    if(sal < 500){
                        imp = sal * 0.05;
                    }else if(sal >= 500 && sal <= 850){
                        imp = sal * 0.10;
                    }else if(sal > 850){
                        imp = sal * 0.15;
                    }
                    System.out.println("O valor do imposto é: " +imp+ "\n");
                    break;
                case 2:
                    System.out.println("Qual o salário do funcionário: ");
                    sal = ler.nextDouble();
                    if(sal < 1500){
                        aum = 25;
                    }else if(sal >= 750 && sal <= 1500){
                        aum = 50;
                    }else if(sal >= 450 && sal < 750){
                        aum = 75;
                    }else if(sal < 450){
                        aum = 100;
                    }
                    novoSal = sal + aum;
                    System.out.println("O valor do imposto é: " +novoSal+ "\n");
                    break;
                case 3:
                    System.out.println("Qual o salário do funcionário: ");
                    sal = ler.nextDouble();
                    if(sal <= 750){
                        System.out.println("Mal Remunerado!");
                    }
                    if(sal > 700){
                        System.out.println("Bem Remunerado!");
                    }
                    break;
                    
            }
        }while(op != 0);
    }
    
}
