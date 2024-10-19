package Ejercicio2;

import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var arreglo = Utiles.crearArregloAleatorio(500, 10000, 100000);
        System.out.printf("El arreglo ordenado de mayor a menor es: %s%n", Arrays.toString(Ejercicio5.ordenarMayoraMenor(arreglo)));
    }

    private static Object[] ordenarMayoraMenor(double[] arreglo) {
        return Arrays
                .stream(arreglo)
                .boxed()
                .sorted(Comparator.comparingDouble(Double::doubleValue).reversed())
                .toArray();
    }
}
