package lesson13;

/**
 * homework lesson13
 *
 * @author Amina
 * 15.04.2021
 */
public abstract class Stage {
    protected int length;
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract void go(Car c);
}
