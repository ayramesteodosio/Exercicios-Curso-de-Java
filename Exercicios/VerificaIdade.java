import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        
        boolean entre = (idade >= 16 && idade <= 18);
        boolean maiorQue = (idade > 65);
        
        System.out.println("Idade entre 16 e 18 (inclusive): " + entre);
        System.out.println("Idade maior que 65: " + maiorQue);
        scanner.close();
    }
}