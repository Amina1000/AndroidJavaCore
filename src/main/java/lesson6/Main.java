package lesson6;

/**
 * homework lesson6
 *
 * @author Amina
 * 18.03.2021
 */
public class Main {
    public static void main(String[] args) {

        /*
        Задача 1,2,3,4,5,6
        */
        Cat[] cats = {new Cat("Barsic", 50),
                new Cat("Cocos", 40),
                new Cat("Semen", 60)};
        Bowl bowl = new Bowl(100);

        for (Cat cat : cats) {
            bowl.info();
            cat.eat(bowl);
            if (cat.isFull()) {
                System.out.printf("Кот %s сыт\n", cat.getName());
            } else {
                System.out.printf("Котик %s голоден\n", cat.getName());
                System.out.println("Добавили корма для кота");
                bowl.info();
            }
        }
    }
}
