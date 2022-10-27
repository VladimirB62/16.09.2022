package Homework_27_10_2022;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmountOfNumbersInIntervalTest {

    @Test
    public void commonCaseTest(){
        float[] arr = new float[]{1.1f,1.3f,1.7f,2.1f,2.2f,2.3f,2.4f,2.5f,6.3f,6.4f,6.5f,6.6f,6.7f,7.2f};
        int interval = 1;
        Assert.assertEquals(6, AmountOfNumbersInInterval.amountOfNumbers(arr, interval));
    }

    @Test
    public void littleArrayTest(){
        float[] arr = new float[]{1.1f,3.5f};
        int interval = 1;
        Assert.assertEquals(1, AmountOfNumbersInInterval.amountOfNumbers(arr, interval));
    }

    @Test
    public void emptyArrayTest(){
        float[] arr = new float[0];
        int interval = 5;
        Assert.assertEquals(0, AmountOfNumbersInInterval.amountOfNumbers(arr, interval));
    }
}