package Lista2.Q1a;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.cadastrarOuEditar(123,
                "Fiat",
                "Amarelo",
                "UNO",
                2020,
                4,
                "Diesel",
                200,
                70000.00,
                true);
        c2.cadastrarOuEditar(456,
                "Fiat",
                "Preto",
                "Siena",
                2021,
                4,
                "Diesel",
                120,
                50000.00,
                false);

        System.out.println("c1 antes de editar: ");
        c1.listar();

        System.out.println("\nc2 antes de editar: ");
        c2.listar();

        c1.cadastrarOuEditar(123,
                "Fiat",
                "Azul",
                "UNO",
                2019,
                4,
                "Diesel",
                40,
                70000.00,
                true);

        c2.cadastrarOuEditar(456,
                "Fiat",
                "Branco",
                "Siena",
                2023,
                4,
                "Diesel",
                30,
                50000.00,
                false);

        System.out.println("\nc1 depois de editar: ");
        c1.listar();

        System.out.println("\nc2 depois de editar: ");
        c2.listar();
    }
}
