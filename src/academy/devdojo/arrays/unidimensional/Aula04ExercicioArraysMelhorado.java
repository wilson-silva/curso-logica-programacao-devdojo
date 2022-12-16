package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula04ExercicioArraysMelhorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        String resultadoMultiplicacaoArrays = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Vetor 1, posição " + i + ": ");
            array1[i] = scan.nextInt();
            System.out.print("Vetor 2, posição " + i + ": ");
            array2[i] = scan.nextInt();
            array3[i] = array1[i] * array2[i];
            resultadoMultiplicacaoArrays += array3[i] + " ";
        }
        System.out.println(resultadoMultiplicacaoArrays);
    }
}
