package Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var pokemonLista = JsonReader.getPokemonLista();
        final var pokemonesfinal = pokemonLista
                .stream()
                .map(x -> x.getHpAumentado())
                .toList();
        System.out.printf("Pokemos con HP incrementado en 500: : %s", pokemonesfinal);
    }
}
