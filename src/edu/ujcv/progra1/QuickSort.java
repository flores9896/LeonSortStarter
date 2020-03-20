package edu.ujcv.progra1;

public  class QuickSort  implements SortTester  {
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        quick(array, 0,array.length-1);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public void quick(int[] arr, int primero, int ultimo){
        int i ,j ,pivote ,auxiliar;

        i = primero;
        j = ultimo;
        pivote = arr[(primero+ultimo)/2];

        do {
            while (arr[i]<pivote){
                i++;
            }
            while (arr[j]>pivote){
                j--;
            }

            if (i<=j){
                auxiliar = arr[i];
                arr[i]= arr[j];
                arr[j]= auxiliar;
                i++;
                j--;

            }

        }while (i<=j);
        if (primero<j){
            quick(arr, primero,j);

        }
        if (i<ultimo){
            quick(arr,i,ultimo);

        }



    }
}
