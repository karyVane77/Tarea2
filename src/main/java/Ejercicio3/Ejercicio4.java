package Ejercicio3;

import java.util.Comparator;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        System.out.printf("La lista de usuarios principal es : %s", listaOrdenadaApellido(listaUsuarios));
    }

    private static List<Usuario> listaOrdenadaApellido(List<Usuario> usuarioList) {
        return usuarioList
                .stream()
                .sorted(Comparator.comparing(Usuario::getApellido).reversed())
                .toList();
    }
}
