package lesson0205;

import java.util.Arrays;

public class Main{
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 1;
//        }

        Arrays.fill(arr, 1);

        singleThread t1 = new singleThread();
        t1.singleThread(arr);

        multiThreads t2 = new multiThreads();
        t2.runMulti(arr);

    }

}


