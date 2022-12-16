package academy.devdojo.arrays.multidimensional;

public class Aula01IntroducaoArraysMultidomensionais {
    public static void main(String[] args) {

        int[][] arrayMulti = new int[2][2];
        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 11;
        arrayMulti[1][0] = 44;
        arrayMulti[1][1] = 55;
        System.out.println(arrayMulti[0][0]);
        System.out.println(arrayMulti[0][1]);
        System.out.println(arrayMulti[1][0]);
        System.out.println(arrayMulti[1][1]);
    }
}
