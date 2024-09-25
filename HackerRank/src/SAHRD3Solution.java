import java.util.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size(); // Obtener el tamaño del arreglo
        int positiveCount = 0; // Contador de positivos
        int negativeCount = 0; // Contador de negativos
        int zeroCount = 0;     // Contador de ceros

        // Recorrer la lista y contar positivos, negativos y ceros
        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Calcular las proporciones y mostrarlas con 6 decimales
        System.out.printf("%.6f%n", (double) positiveCount / n);
        System.out.printf("%.6f%n", (double) negativeCount / n);
        System.out.printf("%.6f%n", (double) zeroCount / n);
    }
}

public class SAHRD3Solution {
    public static void main(String[] args) {
        // Aquí inicializamos los valores directamente
        List<Integer> arr = Arrays.asList(-4, 3, 9, 0, 4, 1); // Ejemplo de valores predefinidos

        // Llamar a la función plusMinus
        Result.plusMinus(arr);
    }
}
