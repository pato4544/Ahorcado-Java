package org.example.entidades;

import java.util.Arrays;

public class JuegoAhorcado {

    private String palabraSecreta;
    private char[] progreso;
    private int intentosMaximos;

    public JuegoAhorcado() {
    }

    public JuegoAhorcado(String palabraSecreta, char[] progreso, int intentosMaximos) {
        this.palabraSecreta = palabraSecreta;
        this.progreso = new char[palabraSecreta.length()];
        this.intentosMaximos = intentosMaximos;
        inicializarProgreso();
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
        this.progreso = new char[palabraSecreta.length()];
    }

    public char[] getProgreso() {
        return progreso;
    }

    public void setProgreso(char[] progreso) {
        this.progreso = progreso;
    }

    public int getIntentosMaximos() {
        return intentosMaximos;
    }

    public void setIntentosMaximos(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
    }

    public void iniciarJuego(String palabraSecreta, int numIntentos){
        this.palabraSecreta = palabraSecreta;
        this.progreso = new char[palabraSecreta.length()];
        this.intentosMaximos = numIntentos;
        inicializarProgreso();
    }

    public void inicializarProgreso(){
        Arrays.fill(progreso, '_');
    }
}