package EstudoDeCaso.Q2;

public class Televisao {
    private int tamanhoDaTela;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;

    public Televisao(int tamanhoDaTela, String marca, int voltagem) {
        this.tamanhoDaTela = tamanhoDaTela;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = 12;
    }

    public void ligar() {
        int consumo = this.tamanhoDaTela * this.voltagem;
        System.out.println("TV ligada. Consumo de " + consumo);
    }

    public void desligar() {
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (this.volume == 10) {
            System.out.println("O volume já está no máximo");
        } else {
            this.volume++;
        }
        System.out.println("Volume: " + this.volume);
    }

    public void diminuirVolume() {
        if (this.volume == 0) {
            System.out.println("O volume já está no mínimo");
        } else {
            this.volume--;
        }
        System.out.println("Volume: " + this.volume);
    }

    public void subirCanal() {
        this.canal++;
        System.out.println("Canal: " + this.canal);
    }

    public void descerCanal() {
        if (this.canal == 1) {
            System.out.println("Você já está no primeiro canal");
        } else {
            this.canal--;
        }
        System.out.println("Canal: " + this.canal);
    }
}
