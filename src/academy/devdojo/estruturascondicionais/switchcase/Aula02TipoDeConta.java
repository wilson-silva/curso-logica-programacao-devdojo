package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula02TipoDeConta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1 - CONTA_POUPANCA");
        System.out.println("2 - CONTA_CORRENTE");
        System.out.println("3 - CONTA_INVESTIMENTO");
        System.out.print("Digite o tipo de conta: ");
        int tipoConta = scan.nextInt();

        System.out.println();
        switch (tipoConta){
            case 1:
                System.out.println("Porcentagem de juros - 0.05%");
                break;
            case 2:
                System.out.println("Porcentagem de juros - 0.02%");
                break;
            case 3:
                System.out.println("Porcentagem de juros - 0.1%");
                break;
            default:
                System.out.println("Tipo de conta inválida");
        }
    }
}
