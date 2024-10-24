import java.util.Scanner;

public class Exercicio05 {

    // método que retorna o nome do dia da semana com base no número
    public static String exibirDiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return "Dia da semana inválido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita que o usuário insira um número de 1 a 7
        System.out.print("Digite um número de 1 a 7 para saber o dia da semana: ");
        int numero = scanner.nextInt();

        // chama o método exibirDiaSemana e exibe o resultado
        String diaSemana = exibirDiaSemana(numero);
        System.out.println("Resultado: " + diaSemana);

        scanner.close();
    }
    
}

