package org.example;
public class TransferenciaEntreContas {
    public void tranfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero!");
        }
    }
}
