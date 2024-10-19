package Ejercicio1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500, 1, 1000);
        System.out.printf("Valores unicos %s", valorUnico(arreglo));
    }

    private static Set<Integer> valorUnico(int[] arreglo) {
        return Arrays
                .stream(arreglo)
                .boxed()
                .collect(Collectors.toSet());
    }
}
