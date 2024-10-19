package Ejercicio3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        System.out.printf("Usuarios con Pais China: %s", getFiltroPais(listaUsuarios, "CHINA"));
    }

    private static List<Usuario> getFiltroPais(List<Usuario> listaTotal, String pais) {
        return listaTotal
                .stream()
                .filter(x -> x.getPais().equalsIgnoreCase(pais))
                .toList();
    }
}
