package Ejercicio2;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var arreglo = Utiles.crearArregloAleatorio(500, 10000, 100000);
        final var finalSuma = Arrays
                .stream(arreglo)
                .sum();
        System.out.printf("La suma de los valores del arreglo es: %,.2f%n", finalSuma);
    }
}
