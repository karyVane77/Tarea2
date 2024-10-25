package Ejercicio4;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {
    @JsonProperty("id")
    private String id;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("nivel")
    private int nivel;
    @JsonProperty("hp")
    private int hp;
    @JsonProperty("ataque")
    private double ataque;
    @JsonProperty("defensa")
    private double defensa;
    @JsonProperty("ataqueEspecial")
    private double ataqueEspecial;
    @JsonProperty("defensaEspecial")
    private double defensaEspecial;
    @JsonProperty("velocidad")
    private double velocidad;
    @JsonProperty("esMacho")
    private boolean macho;
    @JsonProperty("entrenador")
    private String entrenador;
    @JsonProperty("ubicacion")
    private String ubicacion;
    @JsonProperty("tipo")
    private String tipo;

    @Override
    public String toString() {
        final var multilinea = """
                {
                    id: %s
                    nombre: %s
                    nivel: %d
                    hp: %d
                    ataque: %.2f
                    defensa: %.2f
                    ataqueEspecial: %.2f
                    defensaEspecial: %.2f
                    velocidad: %.2f
                    macho: %s
                    entrenador: %s
                    ubicacion: %s
                    tipo: %s
                }
                """;
        return String.format(multilinea, id, nombre, nivel, hp,
                ataque, defensa, ataqueEspecial, defensaEspecial, velocidad, macho, entrenador, ubicacion, tipo);
    }


    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getHp() {
        return hp;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public double getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public double getDefensaEspecial() {
        return defensaEspecial;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public boolean isMacho() {
        return macho;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Pokemon getHpAumentado() {
        Pokemon nuevo = new Pokemon();
        nuevo.setId(id);
        nuevo.setNombre(nombre);
        nuevo.setNivel(nivel);
        nuevo.setAtaque(ataque);
        nuevo.setHp(hp + 500);
        nuevo.setAtaqueEspecial(ataqueEspecial);
        nuevo.setDefensa(defensa);
        nuevo.setDefensaEspecial(defensaEspecial);
        nuevo.setVelocidad(velocidad);
        nuevo.setEntrenador(entrenador);
        nuevo.setMacho(macho);
        nuevo.setUbicacion(ubicacion);
        nuevo.setTipo(tipo);
        return nuevo;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public void setAtaqueEspecial(double ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public void setDefensaEspecial(double defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setMacho(boolean macho) {
        this.macho = macho;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
