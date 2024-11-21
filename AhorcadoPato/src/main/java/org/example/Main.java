package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        String nombre = "Patricio";
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivina mi nombre:");
        String intento = leer.nextLine();
        if(intento.equals(nombre)) {
            System.out.println("Felicitaciones, adivinaste.");
        } else {
            System.out.println("No adivinaste.");
        }


        System.out.println("Por favor ingrese una letra:");
        String letra = leer.nextLine();
        letra.toLowerCase();
        letra.toCharArray();
        */

        String frase = "estelacion";
        char[] arreglo = new char [frase.length()];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = '-'; // Los char no se pueden poner entre comillas dobles
        }

        if (frase.equalsIgnoreCase(String.valueOf(arreglo))){
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, ingresa la letrita:");
        char letra = input.next().charAt(0);



        for (int i = 0; i < frase.length(); i++ ) {
            if (frase.charAt(i) == letra) {
                arreglo[i] = letra;
            }
        }

        System.out.println(arreglo);
    }










    // toLowerCase() para que no haya problemas de letras puestas por el usuario
    // isLetter para reclamarle al usuario que ponga una letra si pone otra cosa



}


