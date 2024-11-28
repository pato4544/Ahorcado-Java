package org.example.entidades;

public class Jugador {

    private String nombre;

    private int intentosFallidos;

    private int intentosExitosos;

    public Jugador() {
    }

    public Jugador(String nombre, int intentosFallidos, int intentosExitosos) {
        this.nombre = nombre;
        this.intentosFallidos = intentosFallidos;
        this.intentosExitosos = intentosExitosos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public int getIntentosExitosos() {
        return intentosExitosos;
    }

    public void setIntentosExitosos(int intentosExitosos) {
        this.intentosExitosos = intentosExitosos;
    }
}
