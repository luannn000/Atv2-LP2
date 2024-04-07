package EstudoDeCaso.Q1;

public class Carro {
    private String modelo;
    private int velocidade;
    private int aceleracao;
    private int marcha;
    private boolean estaLigado;

    public Carro(String modelo, int aceleracao) {
        this.modelo = modelo;
        this.velocidade = 0;
        this.aceleracao = aceleracao;
        this.marcha = 1;
        this.estaLigado = false;
    }

    public void ligar() {
        this.estaLigado = true;
        System.out.println("O carro está ligado");
    }

    public  void desligar() {
        if (this.velocidade == 0 && this.marcha == 1) {
            this.estaLigado = false;
            System.out.println("O carro está desligado");
        } else {
            System.out.println("Diminua a velocidade e/ou a marcha para desligar o carro");
        }
    }

    public void acelerar() {
        if (this.estaLigado) {
            switch (marcha) {
                case 1:
                    if (this.velocidade + this.aceleracao > 20) {
                        System.out.println("Aumente a marcha para acelerar");
                    } else {
                        this.velocidade += this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                case 2:
                    if (this.velocidade + this.aceleracao > 40) {
                        System.out.println("Aumente a marcha para acelerar");
                    } else {
                        this.velocidade += this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                case 3:
                    if (this.velocidade + this.aceleracao > 60) {
                        System.out.println("Aumente a marcha para acelerar");
                    } else {
                        this.velocidade += this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                case 4:
                    if (this.velocidade + this.aceleracao > 75) {
                        System.out.println("Aumente a marcha para acelerar");
                    } else {
                        this.velocidade += this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                case 5:
                    if (this.velocidade + this.aceleracao > 210) {
                        this.velocidade = 210;
                        System.out.println("Velocidade máxima");
                    } else {
                        this.velocidade += this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("O carro está desligado");
        }
    }

    public void desacelerar() {
        if (this.estaLigado) {
            switch (marcha) {
                case 1:
                    if (this.velocidade - this.aceleracao <= 0) {
                        this.velocidade = 0;
                        System.out.println("Você está parado");
                    } else {
                        this.velocidade -= this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                case 2:
                    if (this.velocidade - this.aceleracao < 20) {
                        System.out.println("Diminua a marcha para acelerar");
                    } else {
                        this.velocidade -= this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                case 3:
                    if (this.velocidade - this.aceleracao < 40) {
                        System.out.println("Diminua a marcha para acelerar");
                    } else {
                        this.velocidade -= this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                case 4:
                    if (this.velocidade - this.aceleracao < 60) {
                        System.out.println("Diminua a marcha para acelerar");
                    } else {
                        this.velocidade -= this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                case 5:
                    if (this.velocidade - this.aceleracao < 75) {
                        System.out.println("Diminua a marcha para acelerar");
                    } else {
                        this.velocidade -= this.aceleracao;
                    }
                    System.out.println("A velocidade atual é de " + this.velocidade);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("O carro está desligado");
        }
    }

    public void virarDireita() {
        if (this.estaLigado) {
            System.out.println("Você vira para a direita");
        } else {
            System.out.println("O carro está desligado");
        }
    }

    public void virarEsquerda() {
        if (this.estaLigado) {
            System.out.println("Você vira para a esquerda");
        } else {
            System.out.println("O carro está desligado");
        }
    }

    public void marchaParaCima() {
        if (this.estaLigado) {
            if (this.velocidade + this.aceleracao > 20 && this.marcha == 1) {
                this.marcha++;
            } else if (this.velocidade + this.aceleracao > 40 && this.marcha == 2) {
                this.marcha++;
            } else if (this.velocidade + this.aceleracao > 60 && this.marcha == 3) {
                this.marcha++;
            } else if (this.velocidade + this.aceleracao > 75 && this.marcha == 4) {
                this.marcha++;
            } else {
                if (this.marcha == 5) {
                    System.out.println("Já está na última marcha");
                } else {
                    System.out.println("Acelere mais para aumentar a marcha");
                }
            }
            System.out.println("Sua marcha está na posição " + this.marcha);

        } else {
            System.out.println("O carro está desligado");
        }
    }

    public void marchaParaBaixo() {
        if (this.estaLigado) {
            if (this.velocidade - this.aceleracao < 75 && this.marcha == 5) {
                this.marcha--;
            } else if (this.velocidade - this.aceleracao < 60 && this.marcha == 4) {
                this.marcha--;
            } else if (this.velocidade - this.aceleracao < 40 && this.marcha == 3) {
                this.marcha--;
            } else if (this.velocidade - this.aceleracao < 20 && this.marcha == 2) {
                this.marcha--;
            } else {
                if (this.marcha == 1) {
                    System.out.println("Já está na primeira marcha");
                } else {
                    System.out.println("Desacelere mais para diminuir a marcha");
                }
            }
            System.out.println("Sua marcha está na posição " + this.marcha);

        } else {
            System.out.println("O carro está desligado");
        }
    }
}
