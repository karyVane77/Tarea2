package Ejercicio4;

import java.util.Comparator;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var pokemonLista = JsonReader.getPokemonLista();
        final var pokemonesFiltro = pokemonLista
                .stream()
                .filter(x -> x.getUbicacion().equalsIgnoreCase("CERULEAN CITY"))
                .sorted(Comparator.comparing(Pokemon::getNombre))
                .toList();
        System.out.printf("Pokemons con Ubicacion CERULEAN CITY ordenados de menor a mayor por nombre: %s", pokemonesFiltro);
    }
}
