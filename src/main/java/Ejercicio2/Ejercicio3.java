package Ejercicio2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var arreglo = Utiles.crearArregloAleatorio(500, 10000, 100000);
        final var finalArreglo = Arrays
                .stream(arreglo)
                .boxed()
                .collect(Collectors.toSet());
        System.out.printf("Valores unicos %s", finalArreglo);
    }
}
