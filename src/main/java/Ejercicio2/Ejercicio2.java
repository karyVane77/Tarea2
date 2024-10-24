package Ejercicio2;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var arreglo = Utiles.crearArregloAleatorio(500, 10000, 100000);
        final var finalArreglo = Arrays
                .stream(arreglo)
                .map(x -> x / 1000)
                .toArray();
        System.out.printf("El arreglo divido entre 100 es: %s%n", Arrays.toString(finalArreglo));
    }
}
