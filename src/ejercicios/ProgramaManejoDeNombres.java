package ejercicios;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombre1 ="";
        String nombre2="";
        String nombre3="";

        System.out.println("Introduce nombre1 = " + nombre1);
        nombre1 = scanner.nextLine();

        System.out.println("Introduce nombre2 = " + nombre2);
        nombre2 = scanner.nextLine();

        System.out.println("Introduce nombre3 = " + nombre3);
        nombre3 = scanner.nextLine();



        String [] nombres = {nombre1,nombre2,nombre3};
        int largo= nombres.length;
        String caracterMayuscula="";
        String finNombre ="";
        String nombreModificado1="";
        String nombreModificado2="";
        String nombreModificado3="";
        String nombrefinal="";
       for(int i=0; i< largo; i++){
           if(i==0){
               caracterMayuscula = nombres[0].substring(1,2).toUpperCase();
               caracterMayuscula += ".";
               finNombre = nombres[0].substring(nombres[0].length()-2);
               nombreModificado1=caracterMayuscula+finNombre;

           }else if(i==1){
               caracterMayuscula = nombres[1].substring(1,2).toUpperCase();
               caracterMayuscula += ".";
               finNombre = nombres[1].substring(nombres[1].length()-2);
               nombreModificado2=caracterMayuscula+finNombre;
           } else{
               caracterMayuscula = nombres[2].substring(1,2).toUpperCase();
               caracterMayuscula += ".";
               finNombre = nombres[2].substring(nombres[2].length()-2);
               nombreModificado3=caracterMayuscula+finNombre;
           }
           nombrefinal = nombreModificado1 + "_" + nombreModificado2 + "_" + nombreModificado3 ;;
       }
        System.out.println(nombrefinal);
    }
}
