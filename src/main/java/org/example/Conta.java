package org.example;

public class Conta {
    private String numeroConta;
    private double Saldo;

    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.Saldo = saldo;
    }

    public Conta(){

    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}
