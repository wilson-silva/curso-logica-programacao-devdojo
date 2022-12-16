package academy.devdojo.arrays.unidimensional;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {

        double[] notas = {8, 7.5, 10, 9.3};
        double soma = 0;

        for(int i = 0; i < notas.length; i++){
            soma = soma + notas[i];
        }
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
        System.out.println("Média das notas é: " + (soma/notas.length));
    }
}
