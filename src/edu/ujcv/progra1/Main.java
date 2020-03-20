package edu.ujcv.progra1;

public class Main {

    public static void main(String[] args) {
        MergeSort mre = new MergeSort();

        int[] elementos = {3,2,4,5,6,7,9,9,10,3,5};

//        for (int i = 0; i < elementos.length; i++) {
//            System.out.println(elementos[i]);
//        }
//
//        System.out.println("-----------------------------------");
//
//        mre.sort(elementos,0,elementos.length-1);
//
//        for (int i = 0; i < elementos.length; i++) System.out.println(elementos[i]);
//
//        System.out.println("\n\ntarda "+ mre.sort(elementos)+ " milisegundos");


        ShuffleSort s = new ShuffleSort();
        elementos = s.shuffleSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("\n\ntarda "+ s.sort(elementos)+ " milisegundos");



    }
}
