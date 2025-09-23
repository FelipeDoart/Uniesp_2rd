package LP.Ativ_poo.Quest1;

public class ContraCheque {
    float inss;
    public float calculo (float x) {
        inss = (float) (x - (x * 0.15));
        return inss;

    }
}
