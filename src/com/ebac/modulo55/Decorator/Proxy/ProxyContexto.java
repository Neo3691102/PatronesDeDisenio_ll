package com.ebac.modulo55.Decorator.Proxy;

public class ProxyContexto {
    public static void main(String[] args) {
//        Cuenta cuenta = new Cuenta(1000);
//        Transaccion transaccion = new ImplementacionTransaccion(cuenta);
//
//        System.out.println(cuenta.getFondos());
//        transaccion.depositar(500);
//        System.out.println(cuenta.getFondos());
//        transaccion.retirar(850);
//        System.out.println(cuenta.getFondos());

        Cuenta cuenta = new Cuenta(1000);
        Transaccion transaccion = new TransaccionProxy(cuenta);
        transaccion.retirar(580);
        transaccion.depositar(250);
        transaccion.depositar(100);
        transaccion.retirar(800);
    }
}
