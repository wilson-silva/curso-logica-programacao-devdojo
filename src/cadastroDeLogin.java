import java.util.Scanner;

/*
Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem o nome do usuário (login)
no sistema para agilizar o processo de migração do sistema antigo para o novo.

O usuário não pode deixar o login vazio "", ou criar um usuário com o login "admin" ou "administrador".
Se o valor entrado for válido, o sistema deverá exibir uma mensagem "<nome do usuário> cadastrado com sucesso"
Senão o sistema deverá mostrar o erro "Usuário inválido"

 */
public class cadastroDeLogin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String login;
        System.out.println("Digite o nome do usuário (Login): ");
        login = scan.nextLine();

        if (login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador") || login.equals("")) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.println(login + " cadastrado com sucesso!");
        }
    }
}
