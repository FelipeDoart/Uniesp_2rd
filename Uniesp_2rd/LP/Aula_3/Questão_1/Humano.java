package L.P.Aula_3.Questão_1;

import java.util.Scanner;

public class Humano {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        String resp;

        do {

            System.out.println("Incira seu nome:");
            String nome = sc.next();

            System.out.println("Digite sua idade.");
            p.idade = sc.nextInt();

            System.out.println("Indique seu gênero biologico: M ou F");
            String gen = sc.next();

            System.out.println("Insira seu CPF:");
            String cpf = sc.next();

            System.out.println("Insira seu altura:");
            float  alt = sc.nextFloat();

            System.out.println("Insira seu peso:");
            float ps = sc.nextFloat();

            float Imc = ps/alt*alt;

            System.out.println("De acordo com sua descrição:");
            System.out.println("Seu nome é:" + nome);
            System.out.println("Sua idade:" + p.idade);
            System.out.println("Seu gênero:" + gen);
            System.out.println("Seu CPFd:" + cpf);

            if (Imc < 18.5) {
                System.out.println("Sua classificação é : Baixo peso");
            }
            else if ((Imc > 18.6)&&(Imc < 24.99)){
                System.out.println("Sua classificação é : Normal");
            }
            else if ((Imc > 25)&&(Imc < 29.99)) {
                System.out.println("Sua classificação é : Sobrepeso");
            }
            else {
                System.out.println("Sua classificação é : Obesidade");
            }
            System.out.println("Deseja sobreescrever? S ou N");
            resp = sc.next();
        }while(resp.equalsIgnoreCase("S"));



        /*System.out.println("Antiga: "+ p.idade);
        p.niver();
        System.out.println("Atual: " + p.idade);
        */


    }
}
