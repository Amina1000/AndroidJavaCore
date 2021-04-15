package lesson13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * homework lesson13
 *
 * @author Amina
 * 15.04.2021
 */
public class Car implements Runnable{
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private AtomicBoolean  winner = new AtomicBoolean(false);
    CyclicBarrier cb;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CyclicBarrier cb) {
        this.race = race;
        this.speed = speed;
        this.cb = cb;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        try {
            race.lock.lock();
            winner.set(true);
            System.out.println(name + " победитель!!!");
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }finally {
            race.lock.unlock();
        }
    }
}
