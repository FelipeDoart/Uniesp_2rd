package L.P.Anotacoes;

import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        int resp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----------***------------");
            System.out.println(" Se você deseja proceguir com o atendimento:" +
                    " Digite 1 ");
            System.out.println("Caso não, digite 2.");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Secçao continuará");
                    break;
                case 2:
                    System.out.println("Secção Finalizada.");
                    break;
                default:
                    System.out.println("Digito Errado!");
            }
        System.out.println("Para acessar novamente, digite 0");
        resp = sc.nextInt();
        }while (resp == 0);
    }
}
