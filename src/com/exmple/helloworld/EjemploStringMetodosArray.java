package com.exmple.helloworld;

public class EjemploStringMetodosArray {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());//aqui es un metodo
        //convierte el string en un array de caracteres es de referencia por lo que imprime el hash de referencia trabalenguas.toCharArray() = [C@119d7047
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] array = trabalenguas.toCharArray();
        int largo = array.length;//aqui es un atributo o propiedad inherente del array
        System.out.println("largo = " + largo);
        for (int i=0;i<largo;i++){
            System.out.print(array[i]);
        }
        System.out.println();
        //con el split y la expresion regular hara un array separado por la a [o]=tr,[1]=b...
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));//devuelve tambien una referencia
        // ejemplo para separar la palabar en un array usando .split(regex)
        String [] array2 = trabalenguas.split("a");
        int l = array2.length;
        for (int j=0; j<l;j++){
            System.out.println(array2[j]);
        }
        //obtener extension
        String archivo = "alguna.imagen.jpeg";
        String [] archivoArr = archivo.split("\\.");//para mostrar un caracter especial tambien [.]
        l = archivoArr.length;
        for(int j=0;j<l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);
    }
}
