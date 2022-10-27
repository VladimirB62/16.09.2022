package Homework_27_10_2022;

public class MinusPllusArraySort {

//    Написать метод, который принимает массив целых чисел, а возвращает отсортированный массив в котором сначала идут
//    отрицательные числа. Числа идут в том же порядке как и в первом массиве.

    public static int[] newMinusPlusArray(int[] array){
        int[] minusPlus = new int[array.length];
        int[] plus = new int[array.length];
        int minusCount = 0;
        int plusCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                minusPlus[minusCount] = array[i];
                minusCount++;
            }else {
                plus[plusCount] = array[i];
                plusCount++;
            }
        }
        if (minusCount == 0) return plus;
        else{
            for (int i = 0; i < plusCount; i++) {
                minusPlus[minusCount] = plus[i];
                minusCount++;
            }
        }
        return minusPlus;
    }

}
//с двумя Arraylist было бы проще и сложность меньше, но решил пользоваться только массивами