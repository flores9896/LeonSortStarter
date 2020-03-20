package edu.ujcv.progra1;

public abstract class MergeSort  implements SortTester {
    public long merge(int[] array) {
        long start = System.currentTimeMillis();
        sort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    void merge(int arr[], int l, int m, int r){
//        int l = 0;
//        int m =
        int izq = m - l + 1;
        int derecho = r - m;

        int lIzq[] = new int [izq];
        int lDer[] = new int [derecho];

        for (int i=0; i<izq; ++i)
            lIzq[i] = arr[l + i];
        for (int j=0; j<derecho; ++j)
            lDer[j] = arr[m + 1+ j];

        int i = 0, j = 0;
        int k = l;
        while (i < izq && j < derecho)
        {
            if (lDer[i] <= lIzq[j])
            {
                arr[k] = lDer[i];
                i++;
            }
            else
            {
                arr[k] = lIzq[j];
                j++;
            }
            k++;
        }

        while (i < izq)
        {
            arr[k] = lDer[i];
            i++;
            k++;
        }

        while (j < derecho)
        {
            arr[k] = lIzq[j];
            j++;
            k++;
        }



    }
    void Sort(int arr[]) {
        int l = 0;
        int r = arr.length;
        if (l < r)
        {
            int m = (l+r)/2;

            Sort(arr);
            Sort(arr);

            merge(arr, l, m, r);
        }
    }






}



