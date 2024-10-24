package Ejercicio3;

import java.util.Comparator;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        final var listaFinalUsuarios = listaUsuarios
                .stream()
                .sorted(Comparator.comparing(Usuario::getApellido).reversed())
                .toList();
        System.out.printf("La lista de usuarios principal es : %s", listaFinalUsuarios);
    }
}
