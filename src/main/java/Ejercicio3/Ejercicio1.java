package Ejercicio3;

import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();

        System.out.printf("Usuarios con Peso mayor a 50, nombre comienza en R y apellido termina en O: %s",
                getFiltroPesoNombreApellido(listaUsuarios, 50, "R", "O"));
    }

    private static List<Usuario> getFiltroPesoNombreApellido(List<Usuario> listaTotal, int peso, String nombre, String apellido) {
        return listaTotal
                .stream()
                .filter(x -> x.getPeso() > peso)
                .filter(x -> x.getNombre().toUpperCase().startsWith(nombre))
                .filter(x -> x.getApellido().toUpperCase().endsWith(apellido))
                .toList();
    }
}
