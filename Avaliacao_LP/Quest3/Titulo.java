package LP.Avaliacao_LP.Quest3;

public class Titulo {
    private String nome;
    private String genero;
    private int ano;
    private float tempo;
    private int notas;
    private float Avalia = 0;
    int i = 0;

    public float Avaliacao (){
        Avalia = (float) notas/i;
        return Avalia;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}

    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    public float getTempo() {return tempo;}
    public void setTempo(int tempo) {this.tempo = tempo;}

    public void setNotas(int notas) {this.notas = notas; ++i;}
}
