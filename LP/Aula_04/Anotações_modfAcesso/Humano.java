package LP.Aula_04.Anotações_modfAcesso;

import java.util.Scanner;

public class Humano {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        String resp;

        do {

            System.out.println("Incira seu nome:");
            p.setNome(sc.next());

            System.out.println("Digite sua idade.");
            p.setIdade(sc.nextInt());

            System.out.println("Indique seu gênero biologico: M ou F");
            p.setGen(sc.next());

            System.out.println("Insira seu altura:");
            p.setAlt(sc.nextFloat());

            System.out.println("Insira seu peso:");
            p.setPs(sc.nextFloat());

            System.out.println("De acordo com sua descrição:");
            System.out.println("Seu nome é:" + p.getNome());
            System.out.println("Sua idade:" + p.getIdade());
            System.out.println("Seu gênero:" + p.getGen());
            System.out.println("Sua altura é de: " + p.getAlt());
            System.out.println("Enquanto seu peso é: " + p.getPs());
            p.ind_mass();

            System.out.println("Deseja sobreescrever? S ou N");
            resp = sc.next();
        }while(resp.equalsIgnoreCase("S"));

    }
}
