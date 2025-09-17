package L.P.Anotacoes;

import java.util.Scanner;
public class IMC {
    public static void main(String[] arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("-----------***------------");
        System.out.println("Informe sua altura: ");
        Double alt = sc.nextDouble();

        System.out.println("-----------***------------");
        System.out.println("Informe seu peso:");
        Double peso = sc.nextDouble();

        Double TIMC = peso/ alt*alt;

        if (TIMC < 18.5) {
            System.out.println("Sua classificação é : Baixo peso");
        }
        else if ((TIMC > 18.6)&&(TIMC < 24.99)){
            System.out.println("Sua classificação é : Normal");
        }
        else if ((TIMC > 25)&&(TIMC < 29.99)) {
            System.out.println("Sua classificação é : Sobrepeso");
        }
        else {
            System.out.println("Sua classificação é : Obesidade");
        }
    }
}
