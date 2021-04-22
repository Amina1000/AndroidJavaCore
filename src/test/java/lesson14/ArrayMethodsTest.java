package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


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
    @ParameterizedTest
    @MethodSource("dataForAddOperation")
    public void getElementsAfter4Test(Integer[] a,ArrayList result) {
        ArrayMethods arrayMethods = new ArrayMethods(a);
        Assertions.assertEquals(arrayMethods.getElementsAfter4(),result);
    }

    public static Stream<Arguments> dataForAddOperation() {
        List<Arguments> out = new ArrayList<>();
        int index=0;
        for (int i = 0; i < 10; i++) {
          Integer[]a = {i,2+i,i,4,5,12-i,7};

            for (int j = a.length-1; j >-1; j--) {
                if (a[j]!=4){
                    index=j;
                }else break;
           }
        Integer[]b = new Integer[a.length-index];
            System.arraycopy(a,index,b,0,a.length-index);
            ArrayList<Integer> result = new ArrayList<>(Arrays.asList(b));
            out.add(Arguments.arguments(a,result));
     }


        return out.stream();
    }

    @Test
    void checkListTest() {
        Assertions.assertFalse(arrayMethods.is4or1);
    }

}