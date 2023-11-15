package com.corenetworks.modelo;

import java.util.Arrays;

public class Baraja {
    private Carta[] barajas;


    public Baraja() {
        barajas=new Carta[52];
        int ind=0;
        for (int i = 0; i<Numeros.values().length;i++){
            for (int j = 0; j<Palo.values().length;j++){
                barajas[ind]=new Carta(Palo.values()[i],Numeros.values()[j]);
                ind++;
            }

        }


    }

    public Carta[] getBarajas() {
        return barajas;
    }

    public void setBarajas(Carta[] barajas) {
        this.barajas = barajas;
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "barajas=" + Arrays.toString(barajas) +
                '}';
    }
}
