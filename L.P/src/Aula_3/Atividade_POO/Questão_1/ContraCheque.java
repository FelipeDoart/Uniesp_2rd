package L.P.src.Aula_3.Atividade_POO.Questão_1;

public class ContraCheque {
    float inss;
    public float calculo (float x) {
        inss = (float) (x - (x * 0.15));
        return inss;

    }
}
