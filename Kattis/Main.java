import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Iterar sobre cada línea de entrada
        while (scanner.hasNextLine()) {
            // Leer la línea de entrada y dividirla en números
            String[] numeroscad = scanner.nextLine().split(" ");
            int[] numeros = new int[numeroscad.length];
            
            // Convertir los números de cadena a enteros
            for (int i = 0; i < numeroscad.length; i++) {
            	numeros[i] = Integer.parseInt(numeroscad[i]);
            }
            
            // Iterar sobre cada número en la línea
            for (int i = 0; i < numeros.length; i++) {
                int suma = 0;
                // Calcular la suma de los otros números en la línea
                for (int j = 0; j < numeros.length; j++) {
                    // Excluir el número actual en el cálculo de la suma de los otros números
                    if (j != i) {
                        suma += numeros[j];
                    }
                }
                // Verificar si la suma de los otros números es igual al número actual
                if (suma == numeros[i]) {
                    // Imprimir el número y salir del bucle
                    System.out.println(numeros[i]);
                    break;
                }
            }
        }
        
        // Cerrar el escáner después de leer todas las líneas de entrada
        scanner.close();
    }
}
