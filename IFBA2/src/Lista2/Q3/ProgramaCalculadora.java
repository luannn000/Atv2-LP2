package Lista2.Q3;

import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int operacao;
        double a;
        double b;
        double resultado;

        System.out.println("Escolha a operação que deseja realizar: ");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("Digite qualquer outro número para cancelar");
        operacao = teclado.nextInt();

        if (operacao >= 1 && operacao <= 4) {
            System.out.println("Digite o primeiro número: ");
            a = teclado.nextDouble();

            System.out.println("Digite o segundo número: ");
            b = teclado.nextDouble();

            switch (operacao) {
                case 1:
                    resultado = Calculadora.soma(a, b);
                    break;
                case 2:
                    resultado = Calculadora.subtracao(a, b);
                    break;
                case 3:
                    resultado = Calculadora.multiplicacao(a, b);
                    break;
                case 4:
                    resultado = Calculadora.divisao(a, b);
                    break;
                default:
                    resultado = -1;
                    break;
            }

            System.out.println(String.format("O resultado é %.2f!", resultado));
        }

        System.out.println("FIM DO PROGRAMA");
    }
}
