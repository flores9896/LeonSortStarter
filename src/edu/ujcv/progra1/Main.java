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





        for (int i = 10 ; i<=1000000000; i= i*10){
            int[] arr = array.randomArray(i);

            tempMerge = merge.sort(arr);
            tempHeap = heap.sort(arr);
            tempQuick = quick.sort(arr);

            for (int x= 0 ; x<=arr.length-1; x++){

                arrayMerge[x] = tempMerge;
                arrayHeap[x] = tempHeap;
                arrayQuick[x] = tempQuick;
            }

        }


        for (int j=0; j>=arrayHeap.length-1; j++){
            System.out.println(arrayHeap[j]);
        }
















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
