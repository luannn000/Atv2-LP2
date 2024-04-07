package Lista2.Q1e;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.cadastrarOuEditar("Marcela",
                "05/12/2000",
                "12 345 678-9",
                "123.456.789-00",
                "Aviário",
                "Brasileira",
                5000.00,
                "Enfermeira",
                "Ensino superior completo",
                111111111);

        f2.cadastrarOuEditar("Julia",
                "12/01/1990",
                "98 765 432-1",
                "987.654.321-00",
                "Queimadinha",
                "Colombiana",
                4000,
                "Motorista",
                "Ensino médio completo",
                222222222);

        System.out.println("Dados de f1: ");
        f1.listar();

        System.out.println("Dados de f2: ");
        f2.listar();
    }
}
