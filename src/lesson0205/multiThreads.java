package lesson0205;

import static lesson0205.Main.HALF;

public class multiThreads implements Runnable {
    float[] arr;

    public void runMulti(float[] arr) {
        long a = System.currentTimeMillis();
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, 5000000);
        System.arraycopy(arr, 5000000, a2, 0, 5000000);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, 5000000);
        System.arraycopy(a2, 0, arr, 5000000, 5000000);

        long b = System.currentTimeMillis();
        System.out.println("Время мультипотока " + (b - a));
    }


    @Override
    public void run() {

    }
}
