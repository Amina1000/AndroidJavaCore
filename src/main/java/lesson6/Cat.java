package lesson6;

/**
 * homework lesson6
 *
 * @author Amina
 * 18.03.2021
 */
public class Cat {
    String name;
    int appetite;
    boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public boolean isFull() {
        return full;
    }

    public String getName() {
        return name;
    }

    public void eat(Bowl bowl) {
        int food = bowl.getFood() - appetite;
        if (food < 0) {
            full = false;
            bowl.putFood(Math.abs(food));
        }else {
            full =true;
            bowl.decreaseFood(appetite);
        }
    }

}
