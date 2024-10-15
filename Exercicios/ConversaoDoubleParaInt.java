import java.util.Scanner;

public class ConversaoDoubleParaInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor em double:");
        double valorDouble = scanner.nextDouble();
        
        int valorInt = (int) valorDouble;
        System.out.println("Valor convertido para int: " + valorInt);
        
        System.out.println("Digite outro número real:");
        double outroNumero = scanner.nextDouble();
        
        double resultado = valorInt + outroNumero;
        System.out.println("Resultado da soma do valor inteiro com o número real: " + resultado);
        scanner.close();
    }
}