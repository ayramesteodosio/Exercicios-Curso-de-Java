import java.util.Scanner;

public class Calculadora {

    // Método para somar dois números
    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para subtrair dois números
    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar dois números
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir dois números usando operador ternário
    public static double dividir(double num1, double num2) {
        return (num2 != 0) ? num1 / num2 : Double.NaN; // Retorna "Not a Number" (NaN) em caso de divisão por zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saudação personalizada
        System.out.print("Por favor, insira seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Bem-vindo(a), " + nome + "! Vamos começar os cálculos.");

        // Entrada dos números decimais
        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Insira o segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizando as operações com os números decimais
        double soma = somar(num1, num2);
        double subtracao = subtrair(num1, num2);
        double multiplicacao = multiplicar(num1, num2);
        double divisao = dividir(num1, num2);

        // Exibindo resultados com decimais
        System.out.println("\nResultados com valores decimais:");
        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Subtração: %.2f\n", subtracao);
        System.out.printf("Multiplicação: %.2f\n", multiplicacao);
        System.out.printf("Divisão: %.2f\n", divisao); // Exibe -1.0 caso tenha ocorrido divisão por zero

        // Convertendo os resultados para inteiros
        int somaInt = (int) soma;
        int subtracaoInt = (int) subtracao;
        int multiplicacaoInt = (int) multiplicacao;
        int divisaoInt = (int) divisao;

        // Exibindo resultados com inteiros
        System.out.println("\nResultados convertidos para inteiros:");
        System.out.println("Soma: " + somaInt);
        System.out.println("Subtração: " + subtracaoInt);
        System.out.println("Multiplicação: " + multiplicacaoInt);
        System.out.println("Divisão: " + divisaoInt); // Exibe -1 se a divisão foi por zero

        scanner.close();
    }
}