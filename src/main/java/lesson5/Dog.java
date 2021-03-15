package lesson5;

/**
 * homework lesson5
 *
 * @author Amina
 * 15.03.2021
 */
public class Dog extends Animals {

    public Dog(String name, String color, int age) {
        super(name, color, age);
        this.type = "dog";
    }

    @Override
    public void run(int i) {
        if (i<500) {
            super.run(i);
        } else System.err.println("Превышен лимит дистанции!");
    }

    @Override
    public void swim(int d){
        if (d<10) {
            super.swim(d);
        } else System.err.println("Превышен лимит дистанции!");
    }
}
