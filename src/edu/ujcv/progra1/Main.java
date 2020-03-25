package edu.ujcv.progra1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        //ShuffleSort shuffle = new ShuffleSort();
        HeapSort heap = new HeapSort();

        long arrayMerge[] = new long[8];
        long arrayQuick[] = new long[8];
        long arrayHeap[] = new long[8];



        ArrayList arM = new ArrayList();

        long tempMerge;
        long tempQuick;
        long tempHeap;
        RandomArray array = new RandomArray();

        int position = 0;


        for (int i = 10 ; i<=100000000; i= i*10){
            int[] arr;
            position++;

            arr = array.randomArray(i);
            tempMerge = merge.sort(arr);
            tempHeap = heap.sort(arr);
            tempQuick = quick.sort(arr);

            System.out.println("Con "+ i+" elementos en el array" );
            System.out.println("Merge: "+tempMerge);
            System.out.println("------------------");
            System.out.println("Heap: "+tempHeap);
            System.out.println("------------------");
            System.out.println("Quick: "+tempQuick);
            System.out.println("------------------");
            System.out.println("###########################");


            arrayMerge[position-1] = tempMerge;
            arrayHeap[position-1] = tempHeap;
            arrayQuick[position-1]= tempQuick;




        }

        Promedio promedio = new Promedio();



        System.out.println("========================================================");
        System.out.println("|Promedio del MergeSort: " + promedio.promedio(arrayMerge)+ "ms                           |" );
        System.out.println("|                                                      |");
        System.out.println("|Promedio del QuickSort: " + promedio.promedio(arrayQuick)+ "ms                         |");
        System.out.println("|                                                      |");
        System.out.println("|Promedio del HeapSort: " + promedio.promedio(arrayHeap)+ "ms"+"                         |" );
        System.out.println("|______________________________________________________|");

    }
}
