package edu.ujcv.progra1;

import java.util.Random;

public class RandomArray {
    Random random = new Random();

    int[] randomArray(double tamano){
        int[] arr = new int[(int) tamano];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();

        }

        return arr;
    }

}
