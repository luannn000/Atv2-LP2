package Lista2.Q1c;

public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.cadastrarOuEditar("Leão",
                "25/03/2014",
                "Leonardo",
                15535753,
                "Lagos - Nigéria");

        a2.cadastrarOuEditar("Elefante",
                "02/04/1999",
                "Marcos",
                15535754,
                "Salvador - Bahia");

        System.out.println("a1 antes de editar: ");
        a1.listar();

        System.out.println("\na2 antes de editar: ");
        a2.listar();

        a1.cadastrarOuEditar("Pelicano",
                "12/12/2012",
                "Leonardo",
                85265159,
                "Lagos - Nigéria");

        a2.cadastrarOuEditar("Gaivota",
                "20/02/2020",
                "Marcos",
                15535754,
                "Oslo - Noruega");

        System.out.println("\na1 depois de editar: ");
        a1.listar();

        System.out.println("\na2 depois de editar: ");
        a2.listar();
    }
}
