import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();
        
        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();
        
        double media = (num1 + num2 + num3) / 3.0;
        System.out.println("Média: " + media);
        
        if (media > 50) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        scanner.close();
    }
}