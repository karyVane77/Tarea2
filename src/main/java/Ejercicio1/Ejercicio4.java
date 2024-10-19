package Ejercicio1;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500, 1, 1000);
        System.out.printf("La suma de los valores del arreglo es: %d%n", Ejercicio4.sumarValores(arreglo));
    }

    private static int sumarValores(int[] arreglo) {
        return Arrays
                .stream(arreglo)
                .sum();
    }
}
