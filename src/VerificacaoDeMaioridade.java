import java.util.Scanner;

public class VerificacaoDeMaioridade {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar a idade da pessoa
            System.out.println("Digite a sua idade:");
            int idade = scanner.nextInt();

            // Verificar se a pessoa é maior de idade
            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }


            scanner.close();
        }
    }

