import java.util.Scanner;

public class VerificacaoDeMaioridade {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita a idade da pessoa
            System.out.println("Digite a sua idade:");
            int idade = scanner.nextInt();

            // Verifica se a pessoa é maior de idade
            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }

            // Fecha o scanner
            scanner.close();
        }
    }

