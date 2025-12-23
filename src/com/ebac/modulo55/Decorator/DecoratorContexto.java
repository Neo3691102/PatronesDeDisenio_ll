package com.ebac.modulo55.Decorator;

public class DecoratorContexto {
    public static void main(String[] args) {
        Figura triangulo = new Triangulo();
        triangulo.imprimirInformacion();

        Figura trianguloEq = new TrianguloEquilatero(triangulo);
        trianguloEq.imprimirInformacion();

    }
}
