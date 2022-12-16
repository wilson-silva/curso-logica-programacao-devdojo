package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao;
        boolean flag = true;

        while (flag) {
            System.out.println("----------------------------");
            System.out.println("Menu");
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");

            System.out.println("Digite uma opcao: ");
            opcao = scan.nextInt();

            if (opcao == 3) {
                flag = false;
                System.out.println("Finalizando programa...");
            } else if (opcao == 1) {
                System.out.println("Calculamdo imposto...");
            } else if (opcao == 2) {
                System.out.println("Depositando salário...");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
