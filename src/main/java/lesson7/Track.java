package lesson7;

/**
 * homework lesson7
 *
 * @author Amina
 * 24.03.2021
 */
public class Track extends Sport{
    int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Fitness fitness) {
        fitness.run(length);
    }
}
