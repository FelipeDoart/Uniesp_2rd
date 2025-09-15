package Aula_3.Questão_2;

public class Calculadora {
    double total = 0;
    Interface inter = new Interface();
    /* Soma */
    public void somar(double x, double y){
        for System.out.println("O total da sua soma é: "+ total);
    }
    /*
       Subitrair
    */
    public double subt(double x, double y){
     total = x + y;
     return total;
    }
}
