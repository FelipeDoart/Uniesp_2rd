package LP.Ativ_poo.Quest2;

public class Conta1 {
    int id;
    int numeroConta;
    String titula;
    double valor = 0.0;
    double saldo = 0.0;

    Conta2 c2 = new Conta2();

    public void examinar (){
        System.out.println(saldo);
    }
    public void depositar (double x){
        saldo = saldo + x;
    }
    public void extrair (double x){
        if (saldo < x){
            System.out.println("Baixo saldo!");
            return;
        }else {
            System.out.println("Saldo anterior: "+ saldo);
            System.out.println("-----------");
            saldo = saldo - x;
            System.out.println("Valor de  R$ "+ x +"extraido.");
            System.out.println("Saldo atual: "+ saldo);
        }

    }
    public void transferir(){
        saldo = saldo - valor;
        c2.saldo = valor + c2.saldo;
    }
}
