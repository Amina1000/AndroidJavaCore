package lesson2;

import java.util.Arrays;

public class Main {
    /**
     * homework lesson2
     *
     * @author Admin
     * 01.03.2021
     */
    public static void main(String[] args) {
        // Задача 1
        invertArray();

        // Задача 2
        fillArray();

        // Задача 3
        changeArray();

        //Задача 4
        fillDiagonal();

        //Задача 5
        System.out.println("min: "+ findMin(5, 3, 2, 11, 4, 5, 2));
        System.out.println("max: "+ findMax(5, 3, 2, 11, 4, 5, 2));

    }
    /**
     * 1.  Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     *     С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0 -> arr[i] = 1;
                case 1 -> arr[i] = 0;
                default -> System.out.println("Значения элементов массива должны состоять из 0 и 1");
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 2. Задать пустой целочисленный массив размером 8.
     *    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void fillArray() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + 3*i;
        }
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     *    и числа меньшие 6 умножить на 2;
     */
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i] = arr[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMin(int... arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) min = i;
        }
        return min;
    }

    public static int findMax(int... arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) max = i;
        }
        return max;
    }
}
