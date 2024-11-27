package com.exmple.helloworld;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
           curso=" ";// con "" llegaria vacio
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        //(curso.length() == 0) /curso.length() > 0/esVacio==false
        boolean esVacio2=curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        //curso.isEmpty() == false
        if(esBlanco == false){
            System.out.println(curso.toUpperCase());// como curso es " " no mostraria nada
            System.out.println(curso.concat (" desde cero!"));
            System.out.println("Bienvenido al curso ".concat(curso));
            System.out.println("Bienvenido al curso " + curso);
        }

    }
}
