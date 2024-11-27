package com.exmple.helloworld;

public class EjemploStringConcatenacion {
    public static void main (String [] args){
        String curso = "Programación java";//objeto de referencia
        String profesor = "Andres Guzman";
        String detalle = curso +" con el instructor "+profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        // como lo primero que encuentra es un cadena trata to_do como cadena
        System.out.println(detalle + (numeroA + numeroB));// con el parentesis sale 5
        System.out.println(numeroA + numeroB + detalle );// concatena el resultado de la suma al string

        String detalle2 = curso.concat(" con ").concat(profesor);// no modifica el objetos curso sino que
        // devuelve otra instancia del objeto que se asigna a detalle2 y es mas eficiente por el stringbuilder.
        System.out.println("detalle2 = " + detalle2);


    }
}
