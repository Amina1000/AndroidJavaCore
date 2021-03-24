package lesson7;

/**
 * homework lesson7
 *
 * @author Amina
 * 24.03.2021
 */
public class Wall extends Sport{
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Fitness fitness) {
        fitness.jump(height);
    }

}
