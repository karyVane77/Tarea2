package Ejercicio1;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500, 1, 1000);
        System.out.printf("El arreglo original es: %s%n", Arrays.toString(arreglo));
    }
}
