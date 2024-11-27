package com.exmple.helloworld;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Alejandro";
        System.out.println("nombre = " + nombre);
        System.out.println("nombre.length() = " + nombre.length());//un String es un array de caracteres
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        //comparar a nivel de valor no de instancia || en el texto usa \ para escapar las "
        System.out.println("nombre.equals(\"Alejandro\") = " + nombre.equals("Alejandro"));
        System.out.println("nombre.equals(\"alejandro\") = " + nombre.equals("alejandro"));
        System.out.println("nombre.equals(\"alejandro\") = " + nombre.equalsIgnoreCase("alejandro"));
        //hace una comparacion en base a los numeros de la tabla unicode y los va comparando y ordenando(orden lexicografico)
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("Alejandro"));
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("aron"));
        //recupera el caracter en base as la posicion
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));// ya que el array empieza en 0
        System.out.println("nombre.substring() = " + nombre.substring(1));//obtener parte de un string
        System.out.println("nombre.substring() = " + nombre.substring(1,4));// obtienes desde el numero inicial hasta el final -1
        System.out.println("nombre.substring() = " + nombre.substring(nombre.length()-1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));// inmutabilidad esto es una nueva instancia
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('a'));//permite saber si se encuentra un caracter y devuelve la posicion en la que se encuentra
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));//devuelve -1 si no lo encuentra
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas "));//solo un string no un char y devuelve true o false
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());
    }
}
