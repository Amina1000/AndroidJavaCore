package lesson5;

/**
 * homework lesson5
 *
 * @author Amina
 * 15.03.2021
 */
public class Animals {

    protected String name;
    protected String color;
    protected int age;
    protected String type;

    public Animals() {
    }

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void run(int i) {
        System.out.printf("%s  %s  run %d \n",type,name,i);
    }
    public void swim(int d){
        System.out.printf("%s  %s  swim %d \n",type,name,d);
    }

}
