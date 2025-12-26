package com.ebac.modulo55.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Suscriptor {
    void actualizar(String evento);
}

class Publicador {

    private List<Suscriptor> suscriptores = new ArrayList<>();

    public void suscribir(Suscriptor suscriptor){
        suscriptores.add(suscriptor);
    }

    public void removerSuscriptor(Suscriptor suscriptor){
        suscriptores.remove(suscriptor);
    }

    public void notificar(String event){
        suscriptores.forEach(suscriptor -> suscriptor.actualizar(event));
    }

    public void notificarAlgo(String evento){
        notificar(evento);
    }
}

//clases concretas
class SuscriptorConcreto1 implements Suscriptor{

    @Override
    public void actualizar(String evento) {
        System.out.println("Suscriptor, tienes un nuevo evento: " + evento);
    }
}

class SuscriptorConcreto2 implements Suscriptor{

    @Override
    public void actualizar(String evento) {
        System.out.println("Suscriptor 2 , tienes un nuevo evento: " + evento);
    }
}

