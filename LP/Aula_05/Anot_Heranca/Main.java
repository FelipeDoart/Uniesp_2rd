package LP.Aula_05.Anot_Heranca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("João",12345);
        Aluno a4 = new Aluno(132412514);

        Scanner sc = new Scanner(System.in);
        String resp;

        System.out.println(a2.nome);
        System.out.println(a3.nome+a3.getMat());
        System.out.println(a4.getMat());

        do {
            System.out.println("Insira a 1º nota");
            a.setNota1(sc.nextDouble());
            System.out.println("Insira a 2º nota");
            a.setNota2(sc.nextDouble());
            System.out.println("Insira a 3º nota");
            a.setNota3(sc.nextDouble());

            a.calcularMedia();

            System.out.println("Deseja sobreescrever (S ou N)");
            resp = sc.next();

        }while(resp.equalsIgnoreCase("S"));

    }
}
