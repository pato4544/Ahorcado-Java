package org.example.servicios;
import org.example.entidades.JuegoAhorcado;
import org.example.entidades.Jugador;

import java.util.Arrays;
import java.util.Scanner;

public class Servicio {

    Scanner input = new Scanner(System.in);

    public void menu(){
        JuegoAhorcado juego = new JuegoAhorcado();
        Jugador jugador = new Jugador();

        juego.iniciarJuego(palabraAleatoria(), 6);
        System.out.println("Por favor, ingrese su nombre del usuario: ");
        jugador.setNombre(input.nextLine());
        System.out.println("#### Inicio Juego ####");



        while(juego.getIntentosMaximos() != 0){
            boolean exito = false;
            System.out.println("¿Cual es la letra a buscar?");
            char letra = Character.toLowerCase(input.next().charAt(0));

            for (int i = 0; i < juego.getPalabraSecreta().length(); i++) {
                if(juego.getPalabraSecreta().toLowerCase().charAt(i) == letra){
                    juego.getProgreso()[i] = letra;
                    exito = true;
                }
            }
            if(!exito){
                juego.setIntentosMaximos(juego.getIntentosMaximos()-1);
                jugador.setIntentosFallidos(jugador.getIntentosFallidos()+1);
            }else{
                jugador.setIntentosExitosos(jugador.getIntentosExitosos()+1);
            }
            System.out.println(juego.getProgreso());
            System.out.println("Numero de intentos: " + juego.getIntentosMaximos());

            if(juego.getPalabraSecreta().equalsIgnoreCase(String.valueOf(juego.getProgreso()))){
                break;
            }
        }

        if(juego.getPalabraSecreta().equalsIgnoreCase(String.valueOf(juego.getProgreso()))){
            System.out.println("¡Felicitaciones, ganaste!");
        }else{
            System.out.println("¡Perdiste, la proxima sera!");
        }
        estadisticas(juego,jugador);

    }

    public void estadisticas(JuegoAhorcado juego, Jugador jugador){
        System.out.println("################\n" +
                "Estadisticas\n" +
                "* Nombre usuario: "+ jugador.getNombre()+ "\n" +
                "* Progreso: "+ Arrays.toString(juego.getProgreso())+ "\n" +
                "* Intentos exitosos: "+ jugador.getIntentosExitosos()+ "\n"+
                "* Intentos fallidos: "+ jugador.getIntentosFallidos());
    }

    public String palabraAleatoria(){
        String[] palabras = new String[7];
        palabras[0] = "palabra";
        palabras[1] = "jAva";
        palabras[2] = "programacion";
        palabras[3] = "funcion";
        palabras[4] = "algoritmo";
        palabras[5] = "apocalipsis";
        palabras[6] = "presidente";

        int indice = (int) (Math.random()*1);
        return palabras[indice];
    }
}