/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.*;

public class Ejemplo08 {

    // Ingresar por teclado el tamaño de un arreglo
    // Ingresar por teclado los valores enteros del arreglo
    // Sumar los valores del arreglo, mediante la función misterio
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.print("Ingrese el tamaño del arreglo: \n");
        int tamanio = scanner.nextInt();

        // 2
        int[] arreglo = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Ingrese el valor en la posición \n" + i + ": ");
            arreglo[i] = scanner.nextInt();
            // un ciclo repetitivo for 
        }

        // 3
        int suma = misterio(arreglo, tamanio);

        System.out.println("La suma de los valores del arreglo es: " + suma);

    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
