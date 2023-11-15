package com.corenetworks.presentacion;

import com.corenetworks.modelo.Carta;
import com.corenetworks.modelo.Numeros;
import com.corenetworks.modelo.Palo;

public class PruebaCarta {
    public static void main(String[] args) {
        Carta c1= new Carta(Palo.CORAZONES, Numeros.JOTA);
        System.out.println(c1.toString());
        Carta c2 =new  Carta(Palo.CORAZONES, Numeros.JOTA);
        System.out.println(c2.toString());
        System.out.println("son iguales? "+ c1.equals(c2));

    }
}
