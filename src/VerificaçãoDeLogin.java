import java.util.Scanner;

public class VerificaçãoDeLogin {
    public class VerificacaoLogin {
        public static void main(String[] args) {
            // 1. Crie duas variáveis para armazenar o nome de usuário e a senha corretos
            String usuarioCorreto = "admin";
            String senhaCorreta = "1234";

            // 2. Peça ao usuário para inserir um nome de usuário e uma senha
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            // 3. Verifique se o nome de usuário e a senha inseridos correspondem aos valores corretos
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                // 4. Imprima uma mensagem de sucesso ou de erro, dependendo da validação
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Nome de usuário ou senha incorretos.");
            }

            scanner.close();

        }      }
}
