import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args){

        /*Configuração de variaveis*/
        boolean cont = true;
        Double list = 0.0;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        /*Bem vindo!*/
        System.out.println("Bem vindo a calculadora de média!");

        for (;cont = true;i++){
            System.out.println("{----------------------}");
            System.out.println("Deseja adicionar uma nota? Y or N");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("Y") ){
                System.out.println("[--------------------------------]");
                System.out.println("Insira a nota: ");
                Double not = sc.nextDouble();
                list = list + not;

            }
            else if (resp.equalsIgnoreCase("N")){
                break;
            }
            else {
                System.out.println("[-----------ERROR-----------]");
                System.out.println("Input inválido! Insira Y ou N");
                continue;
            }
        }
        System.out.println(list);
        System.out.println(i);
        Double media = list/i;
        System.out.println("=================================");
        System.out.println("A média do aluno é "+ media);

    }
}
