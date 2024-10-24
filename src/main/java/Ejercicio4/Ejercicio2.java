package Ejercicio4;

import java.util.Comparator;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var pokemonLista = JsonReader.getPokemonLista();
        final var pokemonesFiltrados = pokemonLista
                .stream()
                .filter(x -> x.getTipo().equalsIgnoreCase("ELECTRICIDAD"))
                .sorted(Comparator.comparing(Pokemon::getNivel).reversed())
                .toList();
        System.out.printf("Pokemons con Tipo Electricidad ordenados de mayor a menor por nivel: %s", pokemonesFiltrados);
    }
}
