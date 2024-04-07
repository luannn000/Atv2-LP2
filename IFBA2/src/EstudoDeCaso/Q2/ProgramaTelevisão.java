package EstudoDeCaso.Q2;

import java.util.Scanner;

public class ProgramaTelevisão {
    public static void main(String[] args) {
        Televisao tv = new Televisao(11, "Samsung", 220);
        Scanner teclado = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\n\nEscolha o que deseja fazer: ");
            System.out.println("[1] Ligar a TV");
            System.out.println("[2] Desligar a TV");
            System.out.println("[3] Aumentar o volume");
            System.out.println("[4] Diminuir o volume");
            System.out.println("[5] Subir canal");
            System.out.println("[6] Descer canal");
            System.out.println("[7] Sair do programa");
            escolha = teclado.nextInt();
            System.out.println("\n\n");

            switch (escolha) {
                case 1:
                    tv.ligar();
                    break;
                case 2:
                    tv.desligar();
                    break;
                case 3:
                    tv.aumentarVolume();
                    break;
                case 4:
                    tv.diminuirVolume();
                    break;
                case 5:
                    tv.subirCanal();
                    break;
                case 6:
                    tv.descerCanal();
                    break;
                default:
                    break;
            }
        } while(escolha != 7);
    }
}
