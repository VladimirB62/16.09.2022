package Homework_27_10_2022;

public class AmountOfNumbersInInterval {

    public static int amountOfNumbers(float[] array, int interval) {
        if (array.length ==0) return 0;
        else{
            int amount = 0;
            int maxAmount = 0;
            for (int i = 0; i < array.length-1; i++) {
                amount = 0;
                for (int j = i; j < array.length; j++) {
                    if (array[j] - array[i] <= interval) {
                        amount++;
                        if (maxAmount < amount) maxAmount = amount;
                    }else {
                        break;
                    }
                }
            }
            return maxAmount;
        }
    }
}
