package Ejercicio3;

public class Ejer03 {
    public static void main(String[] args) {
        final var listaUsuarios = ExcelReader.getUsuariosList();
        System.out.printf("La lista de usuarios principal es : %s", listaUsuarios);
    }
}
