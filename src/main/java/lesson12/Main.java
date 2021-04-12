package lesson12;

/**
 * homework lesson12
 *
 * @author Amina
 * 11.04.2021
 */
public class Main {
    /*
    Необходимо написать два метода, которые делают следующее:
    1) Создают одномерный длинный массив, например:
    static final int SIZE = 10 000 000;
    static final int HALF = size / 2;
    float[] arr = new float[size].

    2) Заполняют этот массив единицами.
    3) Засекают время выполнения: long a = System.currentTimeMillis().
    4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:

    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

    5) Проверяется время окончания метода System.currentTimeMillis().
    6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.Massive1();
        myThread.Massive2();
    }
}
