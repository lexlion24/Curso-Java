package com.exmple.helloworld;

public class Operadores {
    public static void main(String[] args) {
        //Operadores ++ y -- 
        int a=1;
        System.out.println("a = " + a);
        int b=++a;// incrementa y asigna
        System.out.println("b = " + b);
        int c=1;
        System.out.println("c = " + c);
        int d=c++;// asigna
        System.out.println("d = " + d);
        //Ternarios (condicion) ? valor1 : valor2 si es true devuelve valor1 y sino valor2
        int e = 2 >3 ? 1:2;
    }
}
