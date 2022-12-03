/*
Dado um determinado salário
se o salário for maior que 4500 imprima 30% do valor
senão imprima 15% do valor
 */
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {

        float salario = 5000;
        double resultado;
        String porcentagem = "";
        if (salario > 4500) {
            resultado = salario * 0.30f;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15f;
            porcentagem = "15%";
        }
        System.out.printf("O valor final em porcentagem de %s é de %.2f", porcentagem, resultado);

    }
}
