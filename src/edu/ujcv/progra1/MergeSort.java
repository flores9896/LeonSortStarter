package edu.ujcv.progra1;

public abstract class MergeSort  implements SortTester {
    public long merge(int[] array) {
        long start = System.currentTimeMillis();
        //mergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }




}



