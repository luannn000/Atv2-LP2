package Lista2.Q1b;

public class ContaPoupanca {
    private String nomeDoCorrentista;
    private String RG;
    private String CPF;
    private double saldo;
    private int numero;
    private int agencia;

    public void cadastrarOuEditar(String nomeDoCorrentista,
                                  String RG,
                                  String CPF,
                                  double saldo,
                                  int numero,
                                  int agencia) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.RG = RG;
        this.CPF = CPF;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
