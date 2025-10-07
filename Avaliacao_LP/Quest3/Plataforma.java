
/*
Uma plataforma de streaming deseja organizar seu catálogo de títulos. O programa deve
        permitir as seguintes operações:
        1. Cadastrar um título.
        2. Exibir os detalhes do título (nome, gênero, ano de lançamento e duração em
        minutos).
        3. Permitir que o usuário avalie o título com uma nota de 0 a 10.
        4. Calcular e exibir a média das avaliações.
        5. Encerrar o programa.
        Classe a ser criada: Filme
        • Atributos: nome, genero, ano, duracao, somaNotas, qtdAvaliacoes
        • Métodos: exibirDetalhes(), avaliar(int nota), calcularMediaAvaliacoes()
*/
package LP.Avaliacao_LP.Quest3;
import java.util.Scanner;
public class Plataforma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Titulo t = new Titulo();

        System.out.println("========================");
        System.out.println("Bem vindo a nosso catalogo!");
        int op;
        do {
            System.out.println("Oque você deseja fazer?");
            System.out.println("----------------------------");
            System.out.println("1 - para inserir um filme.");
            System.out.println("2 - Avaliar o filme.");
            System.out.println("3 - Ver as informações.");
            System.out.println("4 - Encerrar.");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Insira o nome:");
                    t.setNome(sc.nextLine());
                    System.out.println("Insira o género:");
                    t.setGenero(sc.nextLine());
                    System.out.println("Insira o Ano de lançamento:");
                    t.setAno(sc.nextInt());
                    System.out.println("Insira a duração:");
                    t.setTempo(sc.nextInt());
                    continue;
                case 2:
                    System.out.println("--------------------");
                    System.out.println("Insira a sua nota para " + t.getNome());
                    t.setNotas(sc.nextInt());
                    continue;
                case 3:
                    System.out.println("--------------------");
                    System.out.println("Nome: "+ t.getNome());
                    System.out.println("Género: "+ t.getGenero());
                    System.out.println("Ano de lançamento: "+ t.getAno());
                    System.out.println("Duração do filme: "+ t.getTempo());
                    System.out.println("Avaliação: "+ t.Avaliacao());
            }
        } while (op != 4);
    }
}
