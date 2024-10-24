package Ejercicio1;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500, 1, 1000);
        final var finalArreglo = Arrays
                .stream(arreglo)
                .map(x -> x * 2)
                .toArray();
        System.out.printf("El arreglo multiplicado por 2 es: %s%n", Arrays.toString(finalArreglo));
    }
}
