import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args){
        int mat;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----------***------------");
            System.out.println("Informe seu primeiro nome a baixo.");
            String prim = sc.nextLine();

            System.out.println("----------------------");
            System.out.println("Informe sua idade:");
            int idade = sc.nextInt();

            System.out.println("Seu nome:" + prim+ "E sua idade: "+idade);

            System.out.println("Deseja inserir novas informações, digite '0'");
            mat = sc.nextInt();
        }while (mat == 0);
    }
}
