package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final String login = "Luffy";
        final String password = "ReiDosPiratas";

        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Digite seu login");
            String inputLogin = scan.nextLine();

            System.out.println("Digite seu password");
            String inputPassword = scan.nextLine();

            if (inputLogin.equals(login) && inputPassword.equals(password)) {
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA FINALIZADO");
    }
}
