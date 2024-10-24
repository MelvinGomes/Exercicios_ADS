import java.util.Scanner;

public class Exercicio07 {

    // método para calcular o fatorial de um número
    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        // calcula o fatorial multiplicando todos os inteiros de 1 até o número fornecido
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lê um número do usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // calcula e exibe o fatorial do número
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);

        scanner.close();
    }
}
