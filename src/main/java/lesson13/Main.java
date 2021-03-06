package lesson13;

import java.util.concurrent.*;

/**
 * homework lesson13
 *
 * @author Amina
 * 12.04.2021
 */
public class Main {
    public static final int CARS_COUNT = 4;
    public static CyclicBarrier cb = new CyclicBarrier(CARS_COUNT+1);

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10),cb);
        }
        for (Car car : cars) {
            ExecutorService executorService = Executors.newFixedThreadPool(CARS_COUNT+1);
            executorService.execute(car);
            executorService.shutdown();
        }
        try {
            cb.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }

}
