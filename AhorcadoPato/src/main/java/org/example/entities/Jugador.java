package org.example.entities;

import java.util.Scanner;

public class Jugador {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre:");
        String jugador = leer.nextLine();



        System.out.println("Mala suerte " + jugador +". ¡La proxima sera!");
        System.out.println("Felecitaciones" + jugador +". ¡Has adivinado la palabra!");

    }

}
