package Ejercicio3;

import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        System.out.printf("Usuarios con correo dominio gmail.com: %s", getFiltroCorreo(listaUsuarios, "GMAIL.COM"));
    }

    private static List<Usuario> getFiltroCorreo(List<Usuario> listaTotal, String email) {
        return listaTotal
                .stream()
                .filter(x -> x.getCorreo().toUpperCase().contains(email))
                .toList();
    }
}
