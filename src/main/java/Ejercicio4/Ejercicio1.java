package Ejercicio4;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var pokemonesLista = JsonReader.getPokemonLista();
        final var pokemonesFiltrados = pokemonesLista
                .stream()
                .filter(x -> x.getTipo().equalsIgnoreCase("AIRE"))
                .filter(x -> !x.isMacho())
                .toList();
        System.out.printf("Pokemons con Tipo Aire y Hembras: %s", pokemonesFiltrados);
    }
}
