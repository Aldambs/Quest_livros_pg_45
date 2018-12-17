package pg_45;

import java.util.Scanner;

public class Quest_09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia, mes, ano, hora, min;
        System.out.print("Dia, mês, ano ");
        dia = ler.nextInt();
        mes = ler.nextInt();
        ano = ler.nextInt();
        System.out.print("Hora, minutos ");
        hora = ler.nextInt();
        min = ler.nextInt();
        System.out.print("DATA ATUAL = ");
        
	if(mes == 1){
            System.out.println(+dia+ " / Janeiro / " +ano);
        }else if(mes == 2){
            System.out.println(+dia+ " / Fevereiro / " +ano);
        }else if(mes == 3){
            System.out.println(+dia+ " / Março / " +ano);
        }else if(mes == 4){
            System.out.println(+dia+ " / Abril / " +ano);
        }else if(mes == 5){
            System.out.println(+dia+ " / Maio / " +ano);
        }else if(mes == 6){
            System.out.println(+dia+ " / Junho / " +ano);
        }else if(mes == 7){
            System.out.println(+dia+ " / Julho / " +ano);
        }else if(mes == 8){
            System.out.println(+dia+ " / Agosto / " +ano);
        }else if(mes == 9){
            System.out.println(+dia+ " / Setembro / " +ano);
        }else if(mes == 10){
            System.out.println(+dia+ " / Outubro / " +ano);
        }else if(mes == 11){
            System.out.println(+dia+ " / Novembro / " +ano);
        }else if(mes == 12){
            System.out.println(+dia+ " / Dezembro / " +ano);
        }      
        System.out.print("HORA ATUAL = ");
        System.out.print(hora+ " : " +min);
    }
    
}
