package Ejercicio2;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var arreglo = Utiles.crearArregloAleatorio(500, 10000, 100000);
        System.out.printf("El arreglo original es: %s%n", Arrays.toString(arreglo));
    }
}
