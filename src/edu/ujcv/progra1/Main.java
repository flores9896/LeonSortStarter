package edu.ujcv.progra1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        ShuffleSort shuffle = new ShuffleSort();
        HeapSort heap = new HeapSort();




        RandomArray array = new RandomArray();


        int[] elementos = array.randomArray(10);
        System.out.println("----------------------------------------------------");

        int[] elementosOrdenados = merge.sort(elementos,0,elementos.length-1);
        int[] elementosOrdenadosQuick = quick.quick(elementos,0,elementos.length-1);
        int[] elementosOrdenadosShuffle = shuffle.shuffleSort(elementos);


        System.out.println("Merge Sort tarda");
        System.out.println("\n\ntarda "+ merge.sort(elementos)+ " milisegundos");

        System.out.println("----------------------------------------------------");

        System.out.println("Quick Sort tarda");
        System.out.println("\n\ntarda "+ quick.sort(elementos)+ " milisegundos");

        System.out.println("----------------------------------------------------");

        System.out.println("Shuffle Sort tarda");
        System.out.println("\n\ntarda "+ shuffle.sort(elementos)+ " milisegundos");











    }
}
