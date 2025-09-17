package L.P.Anotacoes;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        String resp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja ver outras opções? Digite Y");
        resp = sc.next();
        while (resp.equalsIgnoreCase("S")){

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
            System.out.println("Deseja repetir, digite S");
            resp = sc.next();
        }

    }
}
