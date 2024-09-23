
import java.util.*;

class Solution {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // Leer el número de consultas
        
        // Procesar cada consulta
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();  // Leer el valor de a
            int b = in.nextInt();  // Leer el valor de b
            int n = in.nextInt();  // Leer el número de términos
            
            // Inicializamos la suma con el valor de a
            int sum = a;
            
            // Iterar para generar la serie
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;  // Calcular el término y sumarlo
                System.out.print(sum + " ");  // Imprimir el término seguido de un espacio
            }
            System.out.println();  // Nueva línea después de cada serie
        }
        in.close();  // Cerrar el Scanner
    }
}
