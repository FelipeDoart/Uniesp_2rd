package LP.Avaliacao_LP.Quest4.ExercAeB;

public class Hospital {
    public static void main(String[] args) {
        // Criando instâncias das subclasses
        Clinico c = new Clinico("Dra. Ana Costa", 12345);
        Cirurgiao cr = new Cirurgiao("Dr. Bruno Silva", 67890, "Cirurgia Geral");

        // Usando métodos da classe Clinico Geral
        System.out.println("--- Clínico Geral ---");
        c.realizarExameFisico();

        System.out.println("--- Cirurgião ---");
        cr.obterInformacoes();
    }
}
