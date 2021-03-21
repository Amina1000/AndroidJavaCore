package lesson6;

/**
 * homework lesson6
 *
 * @author Amina
 * 18.03.2021
 */
public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void decreaseFood(int n){
        food-=n;
    }
    public void putFood(int amount){
        food +=amount;
    }

    public void info() {
        System.out.println("в тарелке: " + food);
    }

}
