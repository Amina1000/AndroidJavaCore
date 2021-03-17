package lesson5;

/**
 * homework lesson5
 *
 * @author Amina
 * 15.03.2021
 */
public class Main {
    public static void main(String[] args) {

        int catCount =0;
        int dogCount =0;

        /*Создать классы Собака и Кот с наследованием от класса Животное.
        Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
         */
        Animals[] animals = {new Cat("Ben", "white", 2),
                new Dog("Bill", "black", 3),
                new Cat("Sem", "red", 1),
                new Dog("Pate", "blue", 4)};

        for (Animals animal : animals) {
            animal.run(250);
            animal.swim(7);
            if (animal instanceof Cat) catCount++;
            else dogCount++;
        }
        /*
         * Добавить подсчет созданных котов, собак и животных.
         */
        System.out.println("Всего животных: "+ animals.length);
        System.out.println("Котов: "+catCount+" Собак: " + dogCount);
    }
}
