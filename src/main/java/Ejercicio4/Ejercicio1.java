package Ejercicio4;

import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var pokemonesLista = JsonReader.getPokemonLista();
        final var pokemonesFiltrados = filtrarTipoGenero(pokemonesLista, "AIRE");
        System.out.printf("Pokemons con Tipo Aire y Hembras: %s", pokemonesFiltrados);
    }

    private static List<Pokemon> filtrarTipoGenero(List<Pokemon> listPokemones, String tipo) {
        return listPokemones
                .stream()
                .filter(x -> x.getTipo().equalsIgnoreCase(tipo))
                .filter(x -> !x.isMacho())
                .toList();
    }
}
