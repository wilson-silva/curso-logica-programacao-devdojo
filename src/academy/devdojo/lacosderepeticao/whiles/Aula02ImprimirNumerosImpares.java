package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ImprimirNumerosImpares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        int contador = 0;

        while(contador <= numero){
            if(contador % 2 != 0){
                System.out.print(contador + " ");
            }
            contador++;

        }

    }
}
