package com.corenetworks.presentacion;

import com.corenetworks.modelo.EstadoCivil;
import com.corenetworks.modelo.EstadoCivilAvanzado;

public class ProbarEstadoCivil {
    public static void main(String[] args) {
        EstadoCivil eC1=EstadoCivil.SOLTERO;
        System.out.println(eC1);
        EstadoCivil laura= EstadoCivil.valueOf("CASADO");
        System.out.println(laura);
        System.out.println("Las constantes de estado civl");
        for (EstadoCivil elemento:EstadoCivil.values()
             ) {
            System.out.println(elemento);
        }
        for (int i = 0; i<EstadoCivil.values().length;i++){
            System.out.println(EstadoCivil.values()[i]);
        }
        EstadoCivilAvanzado luis= EstadoCivilAvanzado.CASADO;
        System.out.println(luis);

        System.out.println("recorrer estado civil avanzado");
        for (EstadoCivilAvanzado elemento:EstadoCivilAvanzado.values()
             ) {
            System.out.println(elemento);
            System.out.println(elemento.getDescripcion());
            System.out.println(elemento.name());
            System.out.println(elemento.toString());
            System.out.println(elemento.ordinal());
        }
    }
}
