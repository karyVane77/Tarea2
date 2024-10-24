package Ejercicio4;

import java.util.Comparator;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var pokemonLista = JsonReader.getPokemonLista();
        final var pokemonesFiltro = filtrarUbicacionOrdenadoNombre(pokemonLista, "CERULEAN CITY");

        System.out.printf("Pokemons con Ubicacion CERULEAN CITY ordenados de menor a mayor por nombre: %s", pokemonesFiltro);
    }

    private static List<Pokemon> filtrarUbicacionOrdenadoNombre(List<Pokemon> listPokemones, String ubicacion) {
        return listPokemones
                .stream()
                .filter(x -> x.getUbicacion().equalsIgnoreCase(ubicacion))
                .sorted(Comparator.comparing(Pokemon::getNombre))
                .toList();
    }
}
