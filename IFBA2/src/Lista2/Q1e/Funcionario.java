package Lista2.Q1e;

public class Funcionario {
    private String nome;
    private String dataDeNascimento;
    private String RG;
    private String CPF;
    private String endereco;
    private String naturalidade;
    private double salario;
    private String profissao;
    private String grauDeInstrucao;
    private int matricula;

    public void cadastrarOuEditar(String nome,
                                  String dataDeNascimento,
                                  String RG,
                                  String CPF,
                                  String endereco,
                                  String naturalidade,
                                  double salario,
                                  String profissao,
                                  String grauDeInstrucao,
                                  int matricula) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauDeInstrucao = grauDeInstrucao;
        this.matricula = matricula;
    }

    public void listar() {
        System.out.println(this.nome);
        System.out.println(this.dataDeNascimento);
        System.out.println(this.RG);
        System.out.println(this.CPF);
        System.out.println(this.endereco);
        System.out.println(this.naturalidade);
        System.out.println(this.salario);
        System.out.println(this.profissao);
        System.out.println(this.grauDeInstrucao);
        System.out.println(this.matricula);
    }
}
