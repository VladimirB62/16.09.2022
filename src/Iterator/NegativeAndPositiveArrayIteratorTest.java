package Iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NegativeAndPositiveArrayIteratorTest {

    @Test
    public void negativeAndPositiveArrayWithLongArrayTest(){
        int[] source = {-3,-5,4,-6,0,-9,56,-16,9,8,9,-12,0,};
        List<Integer> iterated = new ArrayList<>();
        List<Integer> expected = Arrays.asList(-3,-5,-6,-9,-16,-12,4,0,56,9,8,9,0);
        NegativeAndPositiveArrayIterator iterator = new NegativeAndPositiveArrayIterator(source);
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterated.add(index);
        }
        assertEquals(expected, iterated);
    }

    @Test
    public void negativeAndPositiveArrayWithPositiveNumbersTest(){
        int[] source = {19,17,13,0,5,3};
        List<Integer> iterated = new ArrayList<>();
        List<Integer> expected = Arrays.asList(19,17,13,0,5,3);
        NegativeAndPositiveArrayIterator iterator = new NegativeAndPositiveArrayIterator(source);
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterated.add(index);
        }
        assertEquals(expected, iterated);
    }

    @Test
    public void negativeAndPositiveArrayWithShortArrayTest(){
        int[] source = {9,-9};
        List<Integer> iterated = new ArrayList<>();
        List<Integer> expected = Arrays.asList(-9,9);
        NegativeAndPositiveArrayIterator iterator = new NegativeAndPositiveArrayIterator(source);
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterated.add(index);
        }
        assertEquals(expected, iterated);
    }

}
