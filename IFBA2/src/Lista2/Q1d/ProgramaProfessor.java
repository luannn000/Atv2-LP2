package Lista2.Q1d;

public class ProgramaProfessor {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        Professor p2 = new Professor();

        p1.cadastrarOuEditar("Osnildo",
                "Mestre",
                "Matemática",
                40,
                5500,
                "Trabalha no IFBA de Feira de Santana");

        p2.cadastrarOuEditar("Ana",
                "Graduada",
                "Educação física",
                40,
                4000,
                "Trabalha em uma escola no interior da Bahia");

        System.out.println("p1 antes de mudar a descrição: ");
        p1.listar();

        System.out.println("\np2 antes de mudar a descrição: ");
        p2.listar();

        p1.setDescricao("Atua na área de ensino");
        p2.setDescricao("Atua em uma escola de Salvador");

        System.out.println("\np1 antes de mudar a descrição: ");
        p1.listar();

        System.out.println("\np2 antes de mudar a descrição: ");
        p2.listar();
    }
}
