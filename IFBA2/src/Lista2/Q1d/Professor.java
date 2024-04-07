package Lista2.Q1d;

public class Professor {
    private String nome;
    private String titulacao;
    private String formacao;
    private int cargaHoraria;
    private double salario;
    private String descricao;

    public void cadastrarOuEditar(String nome,
                                  String titulacao,
                                  String formacao,
                                  int cargaHoraria,
                                  double salario,
                                  String descricao) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void listar() {
        System.out.println(this.nome);
        System.out.println(this.titulacao);
        System.out.println(this.formacao);
        System.out.println(this.cargaHoraria);
        System.out.println(this.salario);
        System.out.println(this.descricao);
    }
}
