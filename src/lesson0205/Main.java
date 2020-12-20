package lesson0205;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] arr1 = new float[SIZE];
        float[] arr2 = new float[SIZE];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 1;
//        }

        Arrays.fill(arr1, 1);
        Arrays.fill(arr2, 1);

        singleThread t1 = new singleThread();
        t1.singleThread(arr1);

        multiThreads t2 = new multiThreads();
        t2.runMulti(arr2);
    }
}


