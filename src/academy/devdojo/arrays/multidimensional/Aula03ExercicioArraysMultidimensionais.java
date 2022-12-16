package academy.devdojo.arrays.multidimensional;

public class Aula03ExercicioArraysMultidimensionais {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        matriz[0][0] = 3;
        matriz[0][1] = 4;
        matriz[0][2] = 5;
        matriz[1][0] = 6;
        matriz[1][1] = 7;
        matriz[1][2] = 8;
        matriz[2][0] = 9;
        matriz[2][1] = 10;
        matriz[2][2] = 11;

        int resultadoMultiplicacaoDiagonalPrincipal = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    resultadoMultiplicacaoDiagonalPrincipal = resultadoMultiplicacaoDiagonalPrincipal * matriz[i][j];
                }
            }
        }
        System.out.println(resultadoMultiplicacaoDiagonalPrincipal);
    }
}
