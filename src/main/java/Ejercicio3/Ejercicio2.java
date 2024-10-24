package Ejercicio3;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        final var listaFinalUsuarios = listaUsuarios
                .stream()
                .filter(x -> x.getCorreo().toUpperCase().contains("GMAIL.COM"))
                .toList();
        System.out.printf("Usuarios con correo dominio gmail.com: %s", listaFinalUsuarios);
    }
}
