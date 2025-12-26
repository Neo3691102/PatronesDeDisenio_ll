package com.ebac.modulo55.State;

public class Mezclador {
    private EstadoMusica estadoMusica;

    public Mezclador() {
        this.estadoMusica = new SinMusica();
    }

    public void setEstado(EstadoMusica estadoMusica) {
        this.estadoMusica = estadoMusica;
    }

    public void estado(){
        this.estadoMusica.Estado();
    }
}
