package lesson7;

/**
 * homework lesson7
 *
 * @author Amina
 * 24.03.2021
 */
public class Main {
    public static void main(String[] args) {
        Fitness[] players ={new Robot("XPhone12",5),
                            new Human("Ben", 10),
                            new Cat("Kokos",15)};
        Sport[] sport = {new Wall(8), new Track(12)};

        for (Fitness player:players) {
            for (Sport s:sport) {
               if (player.isDistance()){
                   s.doIt(player);
               }else break;
            }
            player.info();
            System.out.println("/___________________/");
        }

    }
}
