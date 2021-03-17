package lesson5;

/**
 * homework lesson5
 *
 * @author Amina
 * 15.03.2021
 */
public class Cat extends Animals {

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.type = "cat";

    }

    @Override
    public void run(int i) {
        if (i < 200) {
            super.run(i);
        } else {
            System.err.printf("Кот %s не может пробежать. Превышен лимит дистанции!\n", name);
        }
    }

    @Override
    public void swim(int d) {
        System.err.printf("Кот %s не умеет плавать!\n",this.name);
    }
}
