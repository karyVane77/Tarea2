package Ejercicio4;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var pokemones = JsonReader.getPokemonLista();
        final var mapPokemones = pokemones
                .stream()
                .collect(Collectors.toMap(Pokemon::getId, Function.identity()));
        final var pokemon01 = mapPokemones.get("PKM-133");
        final var pokemon02 = mapPokemones.get("PKM-134");
        final var sumarDefensa = pokemon01.getDefensa() + pokemon02.getDefensa();
        System.out.printf("La suma de las defensas de los Pokemons 1 %s y 2 %s es %.2f", pokemon01, pokemon02,
                sumarDefensa);
    }
}
