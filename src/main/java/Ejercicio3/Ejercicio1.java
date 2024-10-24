package Ejercicio3;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        final var listaFinalUsuarios = listaUsuarios
                .stream()
                .filter(x -> x.getPeso() > 50)
                .filter(x -> x.getNombre().toUpperCase().startsWith("R"))
                .filter(x -> x.getApellido().toUpperCase().endsWith("O"))
                .toList();
        System.out.printf("Usuarios con Peso mayor a 50, nombre comienza en R y apellido termina en O: %s",
                listaFinalUsuarios);
    }
}
