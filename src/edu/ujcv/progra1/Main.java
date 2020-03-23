package edu.ujcv.progra1;

import java.util.ArrayList;
import java.util.Random;

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

        float contadorMerge=0;
        float contadorHeap=0;
        float contadorQuick=0;
        for (int i=0; i<=arrayHeap.length-1;i++) {
            contadorMerge = arrayMerge[i]+contadorMerge;
            contadorHeap = arrayMerge[i]+contadorHeap;
            contadorQuick = arrayMerge[i]+contadorQuick;
        }

        float promedioMerge = contadorMerge/(arrayMerge.length-1);
        float promedioHeap = contadorMerge/(arrayHeap.length-1);
        float promedioQuick = contadorMerge/(arrayQuick.length-1);

        System.out.println("========================================================");
        System.out.println("|Promedio del MergeSort:" + promedioMerge+ "ms         |" );
        System.out.println("|                                                      |");
        System.out.println("|Promedio del QuickSort:" + promedioQuick+ "ms         |");
        System.out.println("|                                                      |");
        System.out.println("|Promedio del HeapSort:" + promedioHeap+ "ms"+"        |" );
        System.out.println("|______________________________________________________|");

    }
}
