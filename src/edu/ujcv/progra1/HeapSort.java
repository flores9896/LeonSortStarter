package edu.ujcv.progra1;


public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }


    public int[] heapSort(int[] arr)
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heap(arr, n, i);

        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heap(arr, i, 0);
        }
        return arr;
    }


    void heap(int arr[], int n, int i)
    {
        int mayor = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[mayor])
            mayor = l;

        if (r < n && arr[r] > arr[mayor])
            mayor = r;

        if (mayor != i)
        {
            int swap = arr[i];
            arr[i] = arr[mayor];
            arr[mayor] = swap;

            heap(arr, n, mayor);
        }
    }



}
