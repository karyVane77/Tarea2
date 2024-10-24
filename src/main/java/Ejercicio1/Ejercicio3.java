package Ejercicio1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var arreglo = RandomUtilities.crearArregloAleatorio(500, 1, 1000);
        final var finalArreglo = Arrays
                .stream(arreglo)
                .boxed()
                .collect(Collectors.toSet());
        System.out.printf("Valores unicos %s", finalArreglo);
    }
}
