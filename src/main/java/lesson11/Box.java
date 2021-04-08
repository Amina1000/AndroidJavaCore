package lesson11;

import java.util.ArrayList;
import java.util.List;

/**
 * homework lesson11
 *
 * @author Amina
 * 08.04.2021
 */
public class Box<T> {
    List<T> boxFruit = new ArrayList<>();
    int count;
    float mass;

    public Box(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            boxFruit.add(fruit);
        }
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\n");
        if (boxFruit.isEmpty()) return "Коробка пуста";
        for (T arr : boxFruit) {
            str.append(arr.toString());
        }
        return "В коробке:" + str;
    }

    public void clearBox() {
        boxFruit.clear();
        count = 0;
    }

    public float getWeight() {
        return mass;
    }

    public void setWeight(float weight) {
        mass = weight * count;
    }

    public boolean compare(Box <T> box) {
        return mass == box.getWeight();
    }

    public void shift(Box<T> box) {
        boxFruit.clear();
        clearBox();
        boxFruit.addAll(box.boxFruit);
        count = box.count;
        box.clearBox();
    }
}
