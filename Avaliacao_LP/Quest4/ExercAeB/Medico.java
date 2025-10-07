package LP.Avaliacao_LP.Quest4.ExercAeB;

public class Medico {
    protected String nome;
    protected int CRM;
    protected int numPacientes;
    protected boolean presenca = true;

    public Medico(String nome, int CRM) {
        this.nome = nome;
        this.CRM = CRM;
    }
    public void cosultar(){
        System.out.println("Nome:" +this.nome+ ", CRM: "+this.CRM);
    }
    //gets e sets
}
