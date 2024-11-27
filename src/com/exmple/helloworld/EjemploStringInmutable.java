package com.exmple.helloworld;

public class EjemploStringInmutable {
    public static void main (String [] args){
        String curso = "Programación java";//objeto de referencia
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);// curso no se modifca sino que crea una instancia nueva
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);
        //aqui se aplica un funcion flecha para modificar el valor del string
        String resultado2 = curso.transform(c ->{
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        // resultado tiene la concatenacion
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);

    }
}
