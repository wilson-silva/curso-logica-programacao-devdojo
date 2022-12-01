/*
Crie uma variável que irá guardar o valor de um salário
Calcule a porcentagem desse salário, sendo os valores da porcentagem:
- 30%
- 15%
- 5%
A cada vez que você calcular guarde o resultado em uma variável
Imprima o resultado e reutilize a variavel que guarda o resultado
para o novo cálculo.
 */
public class ReutilizandoVariaveis {
    public static void main(String[] args) {

        double salario = 1000;
        double resultado;

        System.out.println("Salário: " + salario);

        resultado = salario * 0.3;
        System.out.println("30% eh: " + resultado);

        resultado = salario * 0.15;
        System.out.println("15% eh: " + resultado);

        resultado = salario * 0.05;
        System.out.println("5% eh: " + resultado);

    }
}
