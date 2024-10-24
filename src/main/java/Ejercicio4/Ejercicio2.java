package Ejercicio4;

import java.util.Comparator;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var pokemonLista = JsonReader.getPokemonLista();
        final var pokemonesFiltrados = filtrarTipoOrdenadoNivel(pokemonLista, "ELECTRICIDAD");

        System.out.printf("Pokemons con Tipo Electricidad ordenados de mayor a menor por nivel: %s", pokemonesFiltrados);
    }

    private static List<Pokemon> filtrarTipoOrdenadoNivel(List<Pokemon> listPokemones, String tipo) {
        return listPokemones
                .stream()
                .filter(x -> x.getTipo().equalsIgnoreCase(tipo))
                .sorted(Comparator.comparing(Pokemon::getNivel).reversed())
                .toList();
    }
}
