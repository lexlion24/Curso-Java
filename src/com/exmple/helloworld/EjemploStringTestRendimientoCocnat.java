package com.exmple.helloworld;

public class EjemploStringTestRendimientoCocnat {
    public static void main (String [] args){

        String a= "a";
        String b= "b";
        String c= a;
        //es mutable por lo que se puede ir modificando
        StringBuilder sb= new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i=0;i<500;i++){
            //c = c.concat(a).concat(b).concat("\n");// 500=>4 1000=>8 10000=>395 para pocos es bueno pero pierde capacidad al subir de 10k
            //c += a+b+"\n";// 500=>24 1000=>29 10000=>209
            // usa el mismo objeto por lo que se puede ir anidando el .concat
           sb.append(a).append(b).append("\n");//500=>1 1000=>2 10000=>12
        }

        long fin =System.currentTimeMillis();

        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());



    }
}
