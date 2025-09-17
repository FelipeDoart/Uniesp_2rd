package L.P.Ativ_poo.Quest2;
/*
Questão 2 – Sistema Bancário
Elabore um programa que simule um sistema bancário. Inicialmente o saldo está zerado, mas o cliente pode
escolher qualquer uma das seguintes opções do menu:
• Consultar saldo
• Depositar
• Sacar
• Transferir
Observações:
• O cliente só pode sacar e transferir se o saldo da conta não estiver zerado.
• O menu deve ser exibido quantas vezes o cliente desejar (usar repetição).
Classe a ser criada: ContaBancaria
• Atributos: numeroConta, titular, saldo
• Métodos: consultarSaldo(), depositar(double valor), sacar(double valor),
transferir(ContaBancaria destino, double valor)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;


        String menu;
        Conta1 c = new Conta1();
        Conta2 c2 = new Conta2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Sistema bancário!");
        /*System.out.println("Insira seu id de conta: ");
        c.numeroConta = sc.nextInt();
        c.titula = sc.nextLine();
        c.saldo = sc.nextDouble();*/
        System.out.println("--------------------------------------");
        System.out.println("Deseja usar nosso serviço? S ou N");
        menu = sc.nextLine();

        while (menu.equalsIgnoreCase("S")) {

            System.out.println("===================");
            System.out.println("Porfavor digite a sua necessidade:");
            System.out.println("1 - Examinar o saldo atual");
            System.out.println("2 - Depositar");
            System.out.println("3 - Extrair");
            System.out.println("4 - Trasferir");
            option = sc.nextInt();
            System.out.println("===================");

            switch (option){

                case 1:
                    System.out.println("Seu saldo é: "+c.saldo);
                    break;

                case 2:
                    System.out.println("Insira o valor a ser depositador: ");
                    c.depositar(sc.nextDouble());
                    System.out.println("Deposito feito!");
                    break;

                case 3:
                    System.out.println("Insira o valor da extração");
                    c.extrair(sc.nextDouble());
                    break;

                case 4:
                    System.out.println("Insira a conta a ser transferida.");
                    c.id = sc.nextInt();
                    if (c.id == c.numeroConta){
                        System.out.println("Insira um número diferente da sua conta.");
                        break;
                    }else{
                        System.out.println("------");
                        System.out.println("Insira o valor a ser enviado:");
                        c.valor= sc.nextDouble();
                        c.transferir();
                        System.out.println(c2.saldo);
                    }



                    break;

            }
        }
    }
}
