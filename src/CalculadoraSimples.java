import java.util.Scanner;

public class CalculadoraSimples {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário a entrada dos dois números
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // Solicita ao usuário a operação desejada
            System.out.print("Digite a operação (adição, subtração, multiplicação, divisão): ");
            String operacao = scanner.next().toLowerCase();

            // Realiza o cálculo com base na operação escolhida
            double resultado;
            switch (operacao) {
                case "adição":
                    resultado = num1 + num2;
                    break;
                case "subtração":
                    resultado = num1 - num2;
                    break;
                case "multiplicação":
                    resultado = num1 * num2;
                    break;
                case "divisão":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }

            // Imprime o resultado da operação
            System.out.println("O resultado é: " + resultado);
        }
    }

