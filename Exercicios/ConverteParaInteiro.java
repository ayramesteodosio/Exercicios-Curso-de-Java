import java.util.Scanner;

public class ConverteParaInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número decimal:");
        float numeroDecimal = scanner.nextFloat();
        
        int parteInteira = (int) numeroDecimal;
        System.out.println("A parte inteira do número é: " + parteInteira);
        scanner.close();
    }
}