package lesson8;

import java.util.Arrays;

/**
 * homework lesson8
 *
 * @author Amina
 * 27.03.2021
 */
public class Main {


    public static void main(String[] args) {
        /*Задача 3
        В методе main() вызвать полученный метод,
        обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета
        (сумму элементов, при условии что подали на вход корректный массив).
        */
        int sum = 0;
        String[][] myArray = {
                {"1", "0", "12", "2"},
                {"0", "1", "u7", "2"},
                {"9", "4", "0", "2"},
                {"5", "0", "8", "6"}
        };
        try {
            sum = sum_array_elements(myArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println("Сумма элементов массива = " + sum);

    }
    public static int sum_array_elements(String[][] myArray) throws MyArrayDataException, MyArraySizeException {
        /*
        1.Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
         При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
         Если в каком-то элементе массива преобразование не удалось
         (например, в ячейке лежит символ или текст вместо числа),
         должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
         */

        int a;
        int sum = 0;
        int col;
        int row;

        if (myArray.length != 4) throw new MyArraySizeException("Не коректный размер массива");
        for (String[] strings : myArray) {
            for (String string : strings) {
                if (strings.length != 4) throw new MyArraySizeException("Не коректный размер массива");
                try {
                    a = Integer.parseInt(string);
                    sum += a;
                } catch (NumberFormatException e) {
                    row = Arrays.asList(myArray).indexOf(strings) + 1;
                    col = Arrays.asList(strings).indexOf(string) + 1;
                    throw new MyArrayDataException("Не удалось преобразовать, не верный формат ячейки: строка "
                            + row + " столбец " + col, e);
                }
            }
        }
        return sum;
    }
}
