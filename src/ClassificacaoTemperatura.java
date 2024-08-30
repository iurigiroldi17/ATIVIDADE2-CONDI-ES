import java.util.Scanner;

public class ClassificacaoTemperatura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário a temperatura em graus Celsius
            System.out.print("Digite a temperatura em graus Celsius: ");
            double temperatura = scanner.nextDouble();

            // Classifica a temperatura
            String classificacao;
            if (temperatura > 30) {
                classificacao = "Quente";
            } else if (temperatura >= 15 && temperatura <= 30) {
                classificacao = "Agradável";
            } else {
                classificacao = "Frio";
            }

            // Imprime a classificação
            System.out.println("A classificação é: " + classificacao);
        }
    }

