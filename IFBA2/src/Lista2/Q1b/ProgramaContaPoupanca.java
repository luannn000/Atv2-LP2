package Lista2.Q1b;

public class ProgramaContaPoupanca {
    public static void main(String[] args) {
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca();

        cp1.cadastrarOuEditar("João",
                "12 345 678-9",
                "123.456.789-00",
                1000000,
                1234,
                5678);

        cp2.cadastrarOuEditar("Pedro",
                "98 765 432-1",
                "098.765.432-11",
                50000,
                4321,
                8765);

        System.out.println("Saldo de cp1 antes de editar: ");
        System.out.println(cp1.getSaldo());

        System.out.println("\nSaldo de cp2 antes de editar: ");
        System.out.println(cp2.getSaldo());

        cp1.cadastrarOuEditar("João",
                "12 345 678-9",
                "123.456.789-00",
                200,
                1234,
                5678);

        cp2.cadastrarOuEditar("Pedro",
                "98 765 432-1",
                "098.765.432-11",
                200000,
                4321,
                8765);

        System.out.println("\nSaldo de cp1 depois de editar: ");
        System.out.println(cp1.getSaldo());

        System.out.println("\nSaldo de cp2 depois de editar: ");
        System.out.println(cp2.getSaldo());
    }
}
