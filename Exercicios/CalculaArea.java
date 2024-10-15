public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Área do quadrado (lado 5): " + calcularArea(5));
        System.out.println("Área do círculo (raio 3): " + calcularArea(3.0));
    }
    
    // Método para calcular a área de um quadrado
    public static int calcularArea(int lado) {
        return lado * lado;
    }
    
    // Método para calcular a área de um círculo
    public static double calcularArea(double raio) {
        return Math.PI * raio * raio;
    }
}