package com.exmple.helloworld;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        // intenta mostrar la extension de un archivo
        String archivo = "alguna_imagen.jpeg";// si fuese alguna.imagen.jpg fallaria porque coge el primero
        //int i = archivo.indexOf(".");
        int i=archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));// estatica
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
        // para coger seguro la extension

    }
}
