package Ejercicio4;

public class Ejer04 {
    public static void main(String[] args) {
        final var pokemonesLista = JsonReader.getPokemonLista();
        System.out.printf("Pokemones: %s", pokemonesLista);
    }
}
