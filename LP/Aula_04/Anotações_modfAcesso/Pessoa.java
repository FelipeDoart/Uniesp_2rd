package LP.Aula_04.Anotações_modfAcesso;

public class Pessoa {

    private int idade;
    private String nome;
    private String gen;
    private float alt;
    private float ps;

    public String getGen() {
        return gen;
    }
    public void setGen(String gen) {
        this.gen = gen;
    }

    public float getAlt() {
        return alt;
    }
    public void setAlt(float alt) {
        this.alt = alt;
    }

    public float getPs() {
        return ps;
    }
    public void setPs(float ps) {
        this.ps = ps;
    }

    public String getNome() {
        return nome;
    }
    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }

    public void niver () {
        idade++;
    }
    public void ind_mass () {
        float Imc = ps / alt * alt;

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

    }
}
