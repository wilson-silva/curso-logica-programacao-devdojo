import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: " + idade);



    }
}
