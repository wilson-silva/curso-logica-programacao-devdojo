package academy.devdojo.lacosderepeticao.fors;

import java.util.Scanner;

public class Aula02Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero para saber sua tabuada: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
