package lesson12;

import java.util.Arrays;

/**
 * homework lesson12
 *
 * @author Amina
 * 12.04.2021
 */
public class MyThread {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    long a;

    public void Massive1(){

        Arrays.fill(arr, 1);
        a = System.currentTimeMillis();
        calcMassive(arr, 0);

        System.out.println(System.currentTimeMillis() - a);
    }
    public void Massive2(){

        Arrays.fill(arr, 1);
        a = System.currentTimeMillis();

        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(() -> calcMassive(a1,0));
        Thread t2 = new Thread(() -> calcMassive(a2,h));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);

    }

    void calcMassive(float[] a, int h) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (float) (a[i] * Math.sin(0.2f + (float) (i + h) / 5) * Math.cos(0.2f + (float) (i + h) / 5) * Math.cos(0.4f + (float) (i + h) / 2));
        }
    }
}
