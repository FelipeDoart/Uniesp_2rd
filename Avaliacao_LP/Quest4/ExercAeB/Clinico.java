package LP.Avaliacao_LP.Quest4.ExercAeB;

public class Clinico extends Medico {
    public Clinico(String nome, int CRM) {
        super(nome, CRM);
    }
    public void realizarExameFisico() {
        System.out.println("O(a) Clínico(a) Geral " + this.nome + " está realizando um exame físico.");
    }
}
