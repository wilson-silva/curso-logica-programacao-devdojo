/*
Crie uma classe que calcule uma determinada porcentagem de um dado salário
- Criar uma classe
- Aceitar um valor de entrada para o salário
- Definir o valor da porcentagem (pergunta quanto?) - ex: 30%
- Calcular a porcentagem
 */
import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario;
        double valorPorcentagem;
        double porcentagemDoSalario;

        System.out.println("Entre com o salario:");
        salario = scanner.nextDouble();

        System.out.println("Entre com o valor da porcentagem: ");
        valorPorcentagem = scanner.nextDouble();

        porcentagemDoSalario = salario * (valorPorcentagem / 100);

        System.out.println("A porcentagem do salario eh: " + porcentagemDoSalario);

    }
}
