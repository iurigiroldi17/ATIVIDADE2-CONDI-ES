import java.util.Scanner;

public class ParouÍmpar {
    public static void main(String[] args) {
        // 1. Crie uma variável que armazene um número inteiro
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // 2. Verifique se o número é par ou ímpar
        if (numero % 2 == 0) {
            // 3. Imprima uma mensagem informando se o número é par ou ímpar
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}
