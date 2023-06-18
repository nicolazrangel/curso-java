import java.util.Scanner;

public class Aula04M02 {
    public static void ExercicioCalculadora() {
        Scanner input = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Digite um número");
        valor1 = input.nextInt();

        System.out.println("Digite mais um número");
        valor2 = input.nextInt();

        int soma = valor1 + valor2;
        int subtracao = valor1 - valor2;
        int multiplicacao = valor1 * valor2;
        int divisao = valor1 / valor2;
        int restDivisao = valor1 % valor2;

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A subtração dos valores é: " + subtracao);
        System.out.println("A multiplicação dos valores é: " + multiplicacao);
        System.out.println("A divisão dos valores é: " + divisao);
        System.out.println("O resto da divisão dos valores é: " + restDivisao);

        input.close();
    }
}
