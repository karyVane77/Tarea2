package Ejercicio1;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500, 1, 1000);
        System.out.printf("El arreglo ordenado de menor a mayor es: %s%n", Arrays.toString(ordenarMenoraMayor(arreglo)));
    }

    private static int[] ordenarMenoraMayor(int[] arreglo) {
        return Arrays
                .stream(arreglo)
                .sorted()
                .toArray();
    }
}
