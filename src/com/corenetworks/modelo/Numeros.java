package com.corenetworks.modelo;

public enum Numeros {
    AS("As"),
    DOS("Dos"),
    TRES("Tres"),
    CUATRO("Cuatro"),
    CINCO("Cinco"),
    SEIS("Seis"),
    SIETE("Siete"),
    OCHCO("Ocho"),
    NUEVE("Nueve"),
    DIEZ("Diez"),
    JOTA("Jota"),
    QUEEN("Queen"),
    KING("King");
    private final String num;

    private  Numeros(String descripcion){
        this.num=descripcion;
    }

    public String getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "num='" + num + '\'' +
                '}';
    }
}

