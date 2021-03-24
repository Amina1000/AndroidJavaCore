package lesson7;

/**
 * homework lesson7
 *
 * @author Amina
 * 24.03.2021
 */
public class Cat implements Fitness{
    String name;
    int distance;
    public boolean inDistance = true;

    public Cat(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }
    @Override
    public void run(int length) {
        if (distance>length) {
            System.out.printf("Cat %s has ran \n", name);
        }else  {
            inDistance = false;
            System.out.printf("Cat %s has not ran \n", name);
        }
    }
    @Override
    public void jump(int height) {
        if (distance>height) {
            System.out.printf("Cat %s has jump \n", name);
        }else {
            inDistance = false;
            System.out.printf("Cat %s has not jump \n", name);
        }
    }
    @Override
    public boolean isDistance() {
        return inDistance;
    }
    @Override
    public void info() {
        if (inDistance) {
            System.out.printf("Cat %s on distance \n", name);
        }else System.out.printf("Cat %s off \n", name);
    }
}
