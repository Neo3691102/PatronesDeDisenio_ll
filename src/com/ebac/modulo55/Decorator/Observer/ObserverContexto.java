package com.ebac.modulo55.Decorator.Observer;

public class ObserverContexto {
    public static void main(String[] args) {
        Publicador publicador = new Publicador();

        //objetos de clases concretas
        SuscriptorConcreto1 juan = new SuscriptorConcreto1();
        SuscriptorConcreto2 duncan = new SuscriptorConcreto2();

        publicador.suscribir(juan);
        publicador.suscribir(duncan);
        publicador.notificarAlgo("Nuevas rebajas");
        publicador.notificarAlgo("Temporada del 50%");
    }
}
