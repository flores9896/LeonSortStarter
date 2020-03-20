package edu.ujcv.progra1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        //ShuffleSort shuffle = new ShuffleSort();
        HeapSort heap = new HeapSort();

        long[] arrayMerge = new long[11];
        long[] arrayQuick = new long[11];
        long[] arrayHeap = new long[11];

        long tempMerge;
        long tempQuick;
        long tempHeap;
        RandomArray array = new RandomArray();



        for(double i = 1; i == 1000000000; i=i*10){
            int[] elementos = array.randomArray(i);

            for (int x =0; x<=11; x++){
                tempMerge = merge.sort(elementos);
                tempQuick = quick.sort(elementos);
                tempHeap = heap.sort(elementos);

                arrayMerge[x]= tempMerge;
                arrayQuick[x]= tempQuick;
                arrayHeap[x]= tempHeap;

            }


        }

        for (int i =0 ; i<=arrayHeap.length; i++) System.out.println(arrayHeap[i]);


//
//
//
//        System.out.println("----------------------------------------------------");
//
//        int[] elementosOrdenadosMerge = merge.sort(elementos,0,elementos.length-1);
//        int[] elementosOrdenadosQuick = quick.quick(elementos,0,elementos.length-1);
//        //int[] elementosOrdenadosShuffle = shuffle.shuffleSort(elementos);
//        int[] elementosOrdenadosHeap = heap.heapSort(elementos);
//
//
//        System.out.println("Merge Sort tarda");
//        System.out.println("\n\ntarda "+ merge.sort(elementos)+ " milisegundos");
//
//        System.out.println("----------------------------------------------------");
//
//        System.out.println("Quick Sort tarda");
//        System.out.println("\n\ntarda "+ quick.sort(elementos)+ " milisegundos");
//
//        System.out.println("----------------------------------------------------");
//
//        System.out.println("Heap Sort tarda");
//        System.out.println("\n\ntarda "+ heap.sort(elementos)+ " milisegundos");
//
//
//
//
//
//
//
//
//


    }
}
