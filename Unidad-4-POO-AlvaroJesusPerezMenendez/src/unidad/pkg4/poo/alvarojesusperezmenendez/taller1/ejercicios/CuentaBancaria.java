/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendez.taller1.ejercicios;

/**
 *
 * @author Mitzuke
 */
public class CuentaBancaria {
    int numeroCuenta;
    double saldo;
    String tipoCuenta;

    public CuentaBancaria() {
        numeroCuenta = 0;
        saldo = 0.0;
        tipoCuenta = "Desconocida";
    }

    public CuentaBancaria(int numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    
    
    
    
}
