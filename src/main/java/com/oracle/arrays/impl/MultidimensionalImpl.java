package com.oracle.arrays.impl;

import com.oracle.arrays.Multidimensional;
import com.oracle.arrays.model.Posicion;

public class MultidimensionalImpl implements Multidimensional {
    @Override
    public Posicion getPosition(String[][] datos, String dato) {
        Posicion pos = new Posicion(0, 0);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if (datos[i][j] == dato) {
                    pos.setX(i);
                    pos.setY(j);
                    return pos;
                }
            }
        }
        return null;
    }

    @Override
    public String getData(String[][] datos, Posicion posicion) {
        return datos[posicion.getX()][posicion.getY()];        
    }
}