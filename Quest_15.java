package pg_45;

import java.util.Scanner;

public class Quest_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salM, nht, ndep, 
                nhet, salR, vh, 
                smes, vdep, vhe, 
                imp = 0, salB, salLiq, grat = 0;
        System.out.println("Digite o salário: ");
        salM = ler.nextDouble();
        System.out.println("Digite o número de horas trabalhada: ");
        nht = ler.nextDouble();
        System.out.println("Digite o nº de dependentes: ");
        ndep = ler.nextDouble();
        System.out.println("Digite o nº de hora extra: ");
        nhet = ler.nextDouble();
        vh = (1/5) * salM;
        smes = nht * vh;
        vdep = 32 * ndep;
        vhe = nhet * (vh +(vh * (50/100)));
        salB = smes + vdep + vhe;
        if(salB < 200){
            imp = 0;
        }
        if((salB >= 200) && (salB <= 500)){
            imp = salB * 0.10;
        }
        if(salB > 500){
            imp = salB * 0.20;
        }
        salLiq = salB - imp;
        if(salLiq <= 350){
            grat = 100;
        }
        if(salLiq > 350){
            grat = 50;
        }
        salR = salLiq + grat;
        System.out.println("O salário a receber é: " +salR);
    }
    
}
