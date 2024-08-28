import java.util.Scanner;

public class ClassificaçãoDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar nota do aluno
        System.out.println("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        if (nota == 10) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else {
            System.out.println("Insatisfatório");
        }

        scanner.close();

    }
}