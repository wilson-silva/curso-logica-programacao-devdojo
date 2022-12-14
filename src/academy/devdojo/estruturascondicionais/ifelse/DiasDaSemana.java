package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

/*
Receba um número inteiro do usuário e imprima o dia da semana correspondente
Sendo 1 segunda-feira
 */
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7: ");
        int numero = scan.nextInt();
        String dia = null;

        if(numero == 1){
            dia = "Segunda-feira";
        } else if (numero == 2) {
            dia = "Terça-feira";
        } else if (numero == 3) {
            dia = "Quarta-feira";
        }else if (numero == 4) {
            dia = "Quinta-feira";
        }else if (numero == 5) {
            dia = "Sexta-feira";
        }else if (numero == 6) {
            dia = "Sábado-feira";
        }else if (numero == 7) {
            dia = "Domingo-feira";
        }else{
            dia = "Dia inválido";
        }
        System.out.println(dia);
    }
}
