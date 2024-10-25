package Ejercicio4;

import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var pokemonLista = JsonReader.getPokemonLista();
        final var pokemonesfinal = pokemonLista
                .stream()
                .collect(Collectors.toMap(Pokemon::getId, Pokemon::getHpAumentado));
        System.out.printf("Pokemos con HP incrementado en 500: : %s", pokemonesfinal);
    }
}
