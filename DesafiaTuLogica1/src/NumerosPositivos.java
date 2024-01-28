import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Pedimos al usuario un número positivo
        do {
            System.out.println("Introduce un número positivo:");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número válido. Introduce un número positivo:");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero <= 0);

        // Mostramos los primeros 20 números sucesivos al número ingresado
        System.out.println("Los primeros 20 números sucesivos a " + numero + " son:");
        for (int i = 1; i <= 20; i++) {
            System.out.println(numero + i);
        }
        
        scanner.close();
    }
}