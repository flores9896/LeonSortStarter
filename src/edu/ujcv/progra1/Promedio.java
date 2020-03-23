package edu.ujcv.progra1;

public class Promedio {
    public long promedio(long[] array){
        long contador = 0;

        for (int i = 0 ; i<=array.length-1; i++) {
            contador = array[i] + contador;
        }
        return contador/array.length;

    }
}
