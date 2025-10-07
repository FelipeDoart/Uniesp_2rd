package LP.Avaliacao_LP.Quest4.ExercAeB;

public class Cirurgiao extends Medico {
    private String especialistaCirurg;
    public Cirurgiao(String nome, int CRM,String especialistaCirug) {
        super(nome, CRM);
        this.especialistaCirurg = especialistaCirug;
    }
    public void obterInformacoes() {
        System.out.println("Nome: " + this.nome + ", CRM: " + this.CRM + ", Especialidade: " + this.especialistaCirurg);
    }
}
