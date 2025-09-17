package L.P.Ativ_poo.Quest1;

/*O programa de uma indústria realiza a folha mensal de pagamentos de seus empregados baseando-se nas
seguintes regras:
a. Inicialmente, ler os dados de cada funcionário (matrícula, nome e salário bruto).
b. Depois, o programa deve processar o desconto do INSS, que é 15% do salário bruto. O salário líquido é a
diferença entre o salário bruto e a dedução do INSS.
c. Por fim, exibir na tela o seu contracheque, cujo formato é dado a seguir:
Classe a ser criada: Funcionário
• Atributos: matricula, nome, salarioBruto
• Métodos:calcularInss() , calcularSalarioLiquido() , exibirContracheque()*/

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        ContraCheque c = new ContraCheque();
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        f.nome = sc.nextLine();
        System.out.println("-------------------------");
        System.out.println("Digite a matrícula: ");
        f.mat = sc.nextInt();
        System.out.println("-------------------------");
        System.out.println("Digite seu salario: ");
        f.slrbruto = sc.nextFloat();

        System.out.println("=================================");

        System.out.println("Formulario do funcionario:");
        System.out.println("Nome: " + f.nome);
        System.out.println("Matricula: " + f.mat);
        System.out.println("Salário bruto: " + f.slrbruto);
        System.out.println("Salário liquido (Valor discontado)"+ c.calculo(f.slrbruto));
    }
}



