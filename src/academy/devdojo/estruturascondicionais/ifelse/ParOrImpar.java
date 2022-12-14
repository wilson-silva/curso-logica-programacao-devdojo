package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

/*
Dado um determinado numero inteiro imprima se ele é impar ou par
 */
public class ParOrImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int numero = sc.nextInt();
        String frase = "";

        if(numero % 2 == 0){
            frase = "numero par";
        }else{
            frase = "numero impar";
        }
        System.out.println(frase);
    }
}
