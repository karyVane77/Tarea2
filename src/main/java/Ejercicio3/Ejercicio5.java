package Ejercicio3;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        final var mapUsuarios = listaUsuarios
                .stream()
                .collect(Collectors.toMap(Usuario::getId, Function.identity()));
        final var user01 = mapUsuarios.get("USR-1");
        final var user02 = mapUsuarios.get("USR-4");
        final var sumaEdades = user01.getEdad() + user02.getEdad();
        System.out.printf("La suma de las edades de los usuarios 1:  %s y 2: %s es %d", user01, user02,
                sumaEdades);
    }
}
