import java.util.Scanner;

public class Exercicio04 {

    // método que verifica se o número é par
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // loop para continuar pedindo números ao usuário
        while (true) {
            System.out.print("Digite um número (ou 'Sair' para encerrar): ");
            
            // verifica se o usuário deseja sair do programa
            if (scanner.hasNext("Sair")) {
                break;
            }

            // lê o próximo número digitado
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();

                // chama o método isPar e exibe o resultado
                if (isPar(numero)) {
                    System.out.println(numero + " é um número par.");
                } else {
                    System.out.println(numero + " é um número ímpar.");
                }
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.next(); // descarta a entrada inválida
            }
        }

        scanner.close();
    }
}
