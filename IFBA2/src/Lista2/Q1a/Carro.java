package Lista2.Q1a;

public class Carro {
    private int codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoDeFabricacao;
    private int numDePortas;
    private String tipoDeCombustivel;
    private int quantidadeDisponivel;
    private double preco;
    private boolean ehBasico;

    public void cadastrarOuEditar(int codigo,
                                  String marca,
                                  String cor,
                                  String modelo,
                                  int anoDeFabricacao,
                                  int numDePortas,
                                  String tipoDeCombustivel,
                                  int quantidadeDisponivel,
                                  double preco,
                                  boolean ehBasico) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.numDePortas = numDePortas;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.ehBasico = ehBasico;
    }

    public void listar() {
        System.out.println(this.codigo);
        System.out.println(this.marca);
        System.out.println(this.cor);
        System.out.println(this.modelo);
        System.out.println(this.anoDeFabricacao);
        System.out.println(this.numDePortas);
        System.out.println(this.tipoDeCombustivel);
        System.out.println(this.quantidadeDisponivel);
        System.out.println(this.preco);
        System.out.println(this.ehBasico);
    }
}
