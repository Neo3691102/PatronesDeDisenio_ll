package com.ebac.modulo55.Proxy;

public interface Transaccion {
    void retirar(double monto);
    void depositar(double monto);
    double fondosActuales();
}
