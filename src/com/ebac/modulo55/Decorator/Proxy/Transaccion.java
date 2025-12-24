package com.ebac.modulo55.Decorator.Proxy;

public interface Transaccion {
    void retirar(double monto);
    void depositar(double monto);
    double fondosActuales();
}
