package LP.Aula_05.Anot_Heranca;

public class Aluno extends Pessoa {
    private int mat;
    private double nota1, nota2, nota3, media;

    //Construtores
    public Aluno(){
    }

    public Aluno(String nome) {
        super(nome);
    }

    public Aluno(String nome, int mat) {
        super(nome);
        this.mat = mat;
    }
    public Aluno(int mat) {
        this.mat = mat;
    }

    //Conjunto de Get/Sets
    public double getNota1() {return nota1;}
    public double setNota1(double nota1) {this.nota1 = nota1;
        return nota1;
    }
    public double getNota2() {return nota2;}
    public double setNota2(double nota2) {this.nota2 = nota2;
        return nota2;
    }
    public double getNota3() {return nota3;}
    public double setNota3(double nota3) {this.nota3 = nota3;
        return nota3;
    }
    public void calcularMedia(){
        media = (nota1 + nota2 + nota3)/3;
        System.out.println(media);
    }
    public double getMedia() {return media;}

    public int getMat(){return mat;}
}
