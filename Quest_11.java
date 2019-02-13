package pg_45;

import java.util.Scanner;

public class Quest_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int hI, mI, hF, mF, hD, mD;
        System.out.println("Digite o horário inicial: ");
        System.out.println("Horas: ");
        hI = ler.nextInt();
        System.out.println("Minutos: ");
        mI = ler.nextInt();
        System.out.println("Digite o horário final: ");
        System.out.println("Horas: ");
        hF = ler.nextInt();
        System.out.println("Minutos: ");
        mF = ler.nextInt();
        if(mI > mF){
            mF = mF + 60;
            hF = hF - 1;
        }
        if(hI > hF){
            hF = hF + 24;       
        }
        mD = mF - mI;
        hD = hF - hI;
        System.out.println("O jogo durou: " +hD+ "h:" +mD+ "m");
    }
    
}
