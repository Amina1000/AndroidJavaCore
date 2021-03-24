package lesson7;

/**
 * homework lesson7
 *
 * @author Amina
 * 24.03.2021
 */
public class Human implements Fitness{
    String name;
    int distance;
    public boolean inDistance = true;

    public Human(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run(int length) {
        if (distance>length) {
            System.out.printf("Human %s has ran \n", name);
        }else  {
            inDistance = false;
            System.out.printf("Human %s has not ran \n", name);
        }
    }

    @Override
    public void jump(int height) {
        if (distance>height) {
           System.out.printf("Human %s has jump \n", name);
        }else {
            inDistance = false;
            System.out.printf("Human %s has not jump \n", name);
        }
    }
    @Override
    public boolean isDistance() {
        return inDistance;
    }
    @Override
    public void info() {
        if (inDistance) {
            System.out.printf("Human %s on distance \n", name);
        }else System.out.printf("Human %s off \n", name);
    }

}
