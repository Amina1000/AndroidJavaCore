package lesson10;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * homework lesson10
 *
 * @author Amina
 * 05.04.2021
 */
public class TelephoneBook {

    Map<String, ArrayList<Integer>> tel_book = new TreeMap<>();

    public void add(String name, int number) {
        ArrayList<Integer> telephone = tel_book.getOrDefault(name, new ArrayList<>());
        telephone.add(number);
        tel_book.put(name, telephone);
    }
    public ArrayList<Integer> get(String name){
        return tel_book.get(name);
    }
}
