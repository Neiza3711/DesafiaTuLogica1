public class NumerosMultiplos {
    public static void main(String[] args) {
        int contador = 0; // Inicializamos el contador de múltiplos
        System.out.println("Los números múltiplos de 2 o 3 entre 1 y 100 son:");

        // Utilizamos un bucle for para los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
       // Verificamos si el número es múltiplo de 2 o de 3
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i); 
      // Mostramos el número si es múltiplo de 2 o de 3
                contador++; 
     // Incrementamos el contador de múltiplos
            }
        }

        System.out.println("Total de números múltiplos de 2 o 3: " + contador);
    }
}
