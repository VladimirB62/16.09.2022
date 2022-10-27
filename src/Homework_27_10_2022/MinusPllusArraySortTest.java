package Homework_27_10_2022;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinusPllusArraySortTest {

    @Test
    public void bigArrayTest(){
        int[] bigArray = new int []{4,18,-6,0,45,5,3,-45,0,-5,6,13};
        int[] newBigArray = new int[] {-6,-45,-5,4,18,0,45,5,3,0,6,13};
        Assert.assertArrayEquals(newBigArray,MinusPllusArraySort.newMinusPlusArray(bigArray));
    }

    @Test
    public void positivNumbersArrayTest(){
        int[] bigArray = new int []{4,18,6,0,45,5,3,45,0,5,6,13};
        Assert.assertArrayEquals(bigArray,MinusPllusArraySort.newMinusPlusArray(bigArray));
    }

    @Test
    public void emptyArrayTest(){
        int[] emptyArray = new int[0];
        Assert.assertArrayEquals(emptyArray,MinusPllusArraySort.newMinusPlusArray(emptyArray));
    }

}