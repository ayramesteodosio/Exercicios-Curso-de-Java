import java.util.Scanner;

public class IncrementoDecremento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        
        System.out.println("Valor antes do incremento: " + numero);
        numero++;
        System.out.println("Valor após incremento: " + numero);
        
        System.out.println("Valor antes do decremento: " + numero);
        numero--;
        System.out.println("Valor após decremento: " + numero);
        scanner.close();
    }

}