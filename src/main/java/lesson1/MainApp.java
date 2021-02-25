package lesson1;

/**
 * homework lesson1
 *
 * @author Admin
 * 25.02.2021
 */

//Задача 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
public class MainApp {

    public static void main(String[] args) {
        //Задача 2. Создать переменные всех пройденных типов данных и инициализировать их значения.

        byte b = 3;
        int i = -120;
        short sh = 300;
        long l = 1000;
        float f;
        double d = 2.123;
        char ch = 76;
        boolean bl;

        System.out.println("Задача1 :" +ch +" "+ d);

        //Задача 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – аргументы этого метода, имеющие тип float.

        f = calculateSomething(1.2f,2.4f,10,2);
        System.out.println("Задача3 :" + f);

        //Задача 4. Написать метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

        bl = checkResult(b,sh);
        System.out.println("Задача4 :" + bl);
        //Задача 5. Написать метод, которому в качестве параметра передается целое число,
        //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.

        checkPositive(l);

        //Задача 6. Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

        checkNegative(i);

        //Задача 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        String name ="Алексей";
        sayHi(name);

        //Задача 8.*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        boolean height;
        height = HeightYear(2020);
        System.out.println((height?"Год является високосным":"Год не является високосным"));
    }
    public static float calculateSomething(float a,float b,float c,float d){
        return  a * (b + (c / d));
    }
    public static boolean checkResult(byte a, short b){
        return  (a + b <= 20 & a + b >= 10);
    }
    public  static void checkPositive(long l){
        System.out.println("Задача5 :" + (l < 0 ? "Число отрицательное" : "Число положительное"));
    }
    public  static void checkNegative(int i){
        System.out.println("Задача6 :" + (i<0));
    }
    public static void sayHi(String name){
        System.out.println("Привет,"+name +"!");
    }
    public static boolean HeightYear(int year){
        boolean height;
        float rest;
        rest = year%4;
        if (rest ==0) {
            height = true;
            rest = year % 100;
            if (rest == 0) {
                height = false;
                rest = year % 400;
                if (rest == 0) height = true;
            }
        }else height = false;
        return height;
    }

}
