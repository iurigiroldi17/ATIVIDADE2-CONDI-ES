import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o salário bruto do funcionário
        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();

        // Solicita o número de anos que o funcionário trabalhou na empresa
        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalho = scanner.nextInt();

        // Variáveis para armazenar o bônus, imposto e salário líquido
        double bonus = 0;
        double imposto = 0;
        double salarioLiquido;

        // Calcula o bônus com base nos anos de trabalho
        if (anosTrabalho > 10) {
            bonus = (salarioBruto * 10) / 100;
        } else if (anosTrabalho >= 5) {
            bonus = (salarioBruto * 5) / 100;
        }

        // Calcula o imposto com base no salário bruto
        if (salarioBruto > 5000) {
            imposto = (salarioBruto * 27) / 100;
        } else if (salarioBruto >= 3000) {
            imposto = (salarioBruto * 18) / 100;
        } else {
            imposto = (salarioBruto * 10) / 100;
        }

        // Calcula o salário líquido
        salarioLiquido = salarioBruto + bonus - imposto;

        // Imprime os resultados
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Bônus recebido: R$ " + bonus);
        System.out.println("Imposto descontado: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
