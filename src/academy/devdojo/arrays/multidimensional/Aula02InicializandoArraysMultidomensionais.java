package academy.devdojo.arrays.multidimensional;

import java.util.Scanner;

public class Aula02InicializandoArraysMultidomensionais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] arrayMulti = new int[2][3];

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("Digite o valor da posicao [" +i+ "]["+j+"]: ");
                arrayMulti[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("[" +i+ "]["+j+"] = " + arrayMulti[i][j]);
            }
        }
 
    }
}
