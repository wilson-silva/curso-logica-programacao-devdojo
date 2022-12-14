package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

/*
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os sequintes parâmetros para que eu possa
agilizar o processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
- Se o sexo for Masculino e a idade for maior ou igual a 18 o sistema deve imprimir, alistamento obrigatório
- Se o sexo for Masculino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
- Se o sexo for Feminino e a idade for maior ou igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
- Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir,  alistamento não permitido
 */
public class AlistamentoMilitar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu sexo - M (Masculino) / F (Feminino): ");
        String sexo = scan.next();

        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();

        if(sexo.equalsIgnoreCase("M") && idade >= 18){
            System.out.println("alistamento obrigatório");
        } else if ((sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) && idade < 18) {
            System.out.println("alistamento não permitido");
        }else{
            System.out.println("deseja se alistar?");
        }
    }
}
