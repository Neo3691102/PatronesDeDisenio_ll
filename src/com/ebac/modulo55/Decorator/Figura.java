package com.ebac.modulo55.Decorator;

public interface Figura {
    default void imprimirInformacion(){
        System.out.println(nombre());
        System.out.println(vertices());
        System.out.println(formulaPerimetro());
        System.out.println("----------------");
    }
    String nombre();
    int vertices();
    String formulaPerimetro();
}
