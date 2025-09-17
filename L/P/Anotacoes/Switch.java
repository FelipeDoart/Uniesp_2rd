package L.P.Anotacoes;

import java.util.Scanner;

public class Switch {
    public static void main(String[] arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("-----------***------------");
        System.out.println(" Se você deseja proceguir com o atendimento:" +
                " Digite 1 ");
        System.out.println("Caso não, digite 2.");
        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Secçao continuará");
            case 2:
                System.out.println("Secção Finalizada.");
        }
    }
}
