package Ejercicio2;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var arreglo = Utiles.crearArregloAleatorio(500, 10000, 100000);
        System.out.printf("Valores unicos %s", valorUnico(arreglo));
    }

    public static Set<Double> valorUnico(double[] arreglo) {
        return Arrays
                .stream(arreglo)
                .boxed()
                .collect(Collectors.toSet());
    }
}
