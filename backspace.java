import java.util.Scanner;

public class backspace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer la cadena de entrada
        String entrada = scanner.nextLine();
        
        // Inicializar la cadena de salida
        StringBuilder salida = new StringBuilder();
        
        // Recorrer la cadena de entrada
        for (int i = 0; i < entrada.length(); i++) {
            char caracter = entrada.charAt(i);
            
            // Si el caracter actual es '<' y la cadena de salida no está vacía,
            // eliminamos el último caracter de la cadena de salida
            if (caracter == '<') {
                if (salida.length() > 0) {
                    salida.deleteCharAt(salida.length() - 1);
                }
            } else {
                // Si el caracter no es '<', lo añadimos a la cadena de salida
                salida.append(caracter);
            }
        }
        
        // Imprimir la cadena corregida
        System.out.println(salida.toString());
        
        scanner.close();
    }
}
