import java.util.Scanner;

public class Exercicio06 {

    // função para encontrar o maior valor no vetor
    public static int maiorValor(int[] vetor) {
        int max = vetor[0];  // inicializa com o primeiro elemento do vetor
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];  // atualiza o maior valor
            }
        }
        return max;
    }

    // função para encontrar o menor valor no vetor
    public static int menorValor(int[] vetor) {
        int min = vetor[0];  // inicializa com o primeiro elemento do vetor
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];  // atualiza o menor valor
            }
        }
        return min;
    }

    // função para calcular a média entre o maior e o menor valor
    public static double mediaMaxMin(int[] vetor) {
        int max = maiorValor(vetor);
        int min = menorValor(vetor);
        return (max + min) / 2.0;  // retorna a média
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita o tamanho do vetor ao usuário
        System.out.print("Digite o número de elementos do vetor: ");
        int tamanho = scanner.nextInt();

        // cria o vetor com o tamanho especificado
        int[] numeros = new int[tamanho];

        // lê os valores do vetor a partir da entrada do usuário
        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // testa as funções
        int maior = maiorValor(numeros);
        int menor = menorValor(numeros);
        double media = mediaMaxMin(numeros);

        // exibe os resultados
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média entre maior e menor valor: " + media);

        scanner.close();
    }
}
