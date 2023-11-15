package com.corenetworks.modelo;

public class Carta {
    private Palo palo;
    private Numeros numero;

    public Carta() {
    }

    public Carta(Palo palo, Numeros numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Numeros getNumero() {
        return numero;
    }

    public void setNumero(Numeros numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo=" + palo +
                ", numero=" + numero +
                '}';
    }
}
