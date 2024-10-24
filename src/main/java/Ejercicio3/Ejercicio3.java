package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        final var listaFinalUsuarios = listaUsuarios
                .stream()
                .filter(x -> x.getPais().equalsIgnoreCase("CHINA"))
                .toList();
        System.out.printf("Usuarios con Pais China: %s", listaFinalUsuarios);
    }
}
