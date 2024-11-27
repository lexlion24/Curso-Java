package com.exmple.helloworld;

public class EjemploString {
    public static void main (String [] args){
        String curso = "Programación java";//objeto de referencia
        //Por debajo java esta creando una referencia al objeto
        String curso2 = new String("Programación java");
        
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 " + esIgual);
        
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2)" + esIgual);

        String curso3 = "Programación java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 =" + esIgual);
        // es true porque lo que ocurre es que como tienene el mismo valor y se han instanciado
        // de la misma forma entonces si que es el mismo objeto pero sustituyendo a el curso 1
    }
}
