package com.corenetworks.modelo;

public enum Palo {
    CORAZONES("Corazones"),
    PICAS("Picas"),
    TREBOLES("Treboles"),
    DIAMANTES("Diamantes");
    private final String descripcion;
    private Palo(String descripcion){
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Palo{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
