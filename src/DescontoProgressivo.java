import java.util.Scanner;

public class DescontoProgressivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor total da compra
        System.out.print("Digite o valor total da compra: R$ ");
        double valorOriginal = scanner.nextDouble();

        // Variáveis para armazenar o percentual de desconto e o valor descontado
        double percentualDesconto = 0;
        double valorDescontado;
        double valorFinal;

        // Determina o percentual de desconto com base no valor da compra
        if (valorOriginal > 500) {
            percentualDesconto = 20;
        } else if (valorOriginal >= 200) {
            percentualDesconto = 10;
        } else if (valorOriginal >= 100) {
            percentualDesconto = 5;
        } else {
            percentualDesconto = 0;
        }

        // Calcula o valor descontado e o valor final
        valorDescontado = (valorOriginal * percentualDesconto) / 100;
        valorFinal = valorOriginal - valorDescontado;

        // Imprime os resultados
        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Percentual de desconto aplicado: " + percentualDesconto + "%");
        System.out.println("Valor descontado: R$ " + valorDescontado);
        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}
