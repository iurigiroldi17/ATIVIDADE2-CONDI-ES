import java.util.Scanner;

public class VerificaçãodeAprovaçãoEscolar {
    public static void main(String[] args) {
        // 1. Peça ao usuário para inserir a média final de um aluno
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();

        // 2. Verifique se o aluno foi aprovado, reprovado ou está em recuperação
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
