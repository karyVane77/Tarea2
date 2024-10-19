package Ejercicio1;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500, 1, 1000);
        System.out.printf("El arreglo multiplicado por 2 es: %s%n", Arrays.toString(Ejercicio2.multiplica2(arreglo)));
    }

    private static int[] multiplica2(int[] arreglo) {
        return Arrays
                .stream(arreglo)
                .map(x -> x * 2)
                .toArray();
    }
}
