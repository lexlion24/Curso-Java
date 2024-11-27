package com.exmple.helloworld;

public class HolaMundo {
    public static void main(String[] args) {
        String saludar ="Hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 11;
        int numero3= 5;
        boolean valor= true;
        //contexto
        if(valor){
            System.out.println("numero = " + numero);
            int numero2=5;// numero2 solo existe aquí
            numero3=7;
        }
        System.out.println("numero3  = " + numero3 );
        //forma dinámica de crear variables
        var numero4 = 15;

        String nombre;
        nombre= "Andres";
        if (numero > 10){
            nombre="Juan";
        }
        System.out.println("nombre = " + nombre);
    }

}

