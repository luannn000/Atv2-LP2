package EstudoDeCaso.Q1;

import java.util.Scanner;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fastback", 5);
        Scanner teclado = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\n\nEscolha o que deseja fazer: ");
            System.out.println("[1] Ligar o carro");
            System.out.println("[2] Desligar o carro");
            System.out.println("[3] Acelerar o carro");
            System.out.println("[4] Desacelerar o carro");
            System.out.println("[5] Virar direita");
            System.out.println("[6] Virar esquerda");
            System.out.println("[7] Aumentar a marcha");
            System.out.println("[8] Diminuir a marcha");
            System.out.println("[9] Sair do programa");
            escolha = teclado.nextInt();
            System.out.println("\n");

            switch (escolha) {
                case 1:
                    c1.ligar();
                    break;
                case 2:
                    c1.desligar();
                    break;
                case 3:
                    c1.acelerar();
                    break;
                case 4:
                    c1.desacelerar();
                    break;
                case 5:
                    c1.virarDireita();
                    break;
                case 6:
                    c1.virarEsquerda();
                    break;
                case 7:
                    c1.marchaParaCima();
                    break;
                case 8:
                    c1.marchaParaBaixo();
                    break;
                default:
                    break;
            }

        } while(escolha != 9);
    }
}
