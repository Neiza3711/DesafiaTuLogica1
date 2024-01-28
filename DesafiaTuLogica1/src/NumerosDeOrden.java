import java.util.Scanner;

public class NumerosDeOrden{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los 3 números
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();

        // Pedir al usuario que elija el orden de ordenamiento
        System.out.println("¿En qué orden desea mostrar los números?");
        System.out.println("Ingrese 'asc' para ascendente o 'desc' para descendente:");
        String orden = scanner.next();

        // Ordenar los números según la opción seleccionada
        if (orden.equals("asc")) {
            // Ordenar de manera ascendente
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 > num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
        } else if (orden.equals("desc")) {
            // Ordenar de manera descendente
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 < num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
        } else {
            System.out.println("Orden de ordenamiento no válida. Por favor, ingrese 'asc' o 'desc'.");
            return; // Terminar el programa si la opción no es válida
        }

        // Mostrar los números en el orden seleccionado
        System.out.println("Los números ordenados son:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        scanner.close();
    }
}
