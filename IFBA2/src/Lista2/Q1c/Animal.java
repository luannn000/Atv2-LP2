package Lista2.Q1c;

public class Animal {
    private String especie;
    private String dataDeNascimento;
    private String nome;
    private int numeroDeRegistro;
    private String localDeNascimento;

    public void cadastrarOuEditar(String especie,
                                  String dataDeNascimento,
                                  String nome,
                                  int numeroDeRegistro,
                                  String localDeNascimento) {
        this.especie = especie;
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
        this.localDeNascimento = localDeNascimento;
    }

    public void listar() {
        System.out.println(this.especie);
        System.out.println(this.dataDeNascimento);
        System.out.println(this.nome);
        System.out.println(this.numeroDeRegistro);
        System.out.println(this.localDeNascimento);
    }
}
