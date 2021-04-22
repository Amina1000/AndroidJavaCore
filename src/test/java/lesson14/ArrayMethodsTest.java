package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;



/**
 * homework lesson14
 *
 * @author Amina
 * 22.04.2021
 */
class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    @BeforeAll
    @Test
    static void ArrayMethodsConstructor() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Integer[] a = {1, 2, 4};
            new ArrayMethods(a);
        });
    }

    @BeforeEach
    public void init() {
        Integer[] num = new Integer[7];
        for (int i = 0; i <num.length ; i++) {
            num[i] = (int)(Math.random()*7);
        }
        arrayMethods = new ArrayMethods(num);
    }

    @Test
    void getElementsAfter4Test() {
        ArrayMethods arrayMethods = new ArrayMethods(1,2,3,4,5,6,7);
        Integer[]a = {5,6,7};
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(a));
        Assertions.assertEquals(arrayMethods.getElementsAfter4(),result);
    }

    @Test
    void checkListTest() {
        Assertions.assertFalse(arrayMethods.is4or1);
    }

}