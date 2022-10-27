package Homework_22_09_2022;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        int[] array = new int[] {1, 1, 7, 8, 2, 2, 8, 7, 7, 9 };
        System.out.println(Arrays.toString(findDuplicates(array)));

        primeNumbers();
        primeNumbers2();
    }

    public static Integer[] findDuplicates(int[] array) {
        HashSet duplicates = new HashSet();
        HashSet<Integer> uniqueEl = new HashSet<>();
        for (int i : array) {
            if (uniqueEl.contains(i)) {
                duplicates.add(i);
            }else{
                uniqueEl.add(i);
            }
        }


        Integer[] arrayFromDuplicates = (Integer[]) duplicates.toArray(new Integer[duplicates.size()]);

        return  arrayFromDuplicates;
    }

    public static void primeNumbers(){
        System.out.println(2);
        boolean isPrime = true;
        int c = 0;
        for (int i = 3; i < 101; i+=2) {
            isPrime = true;
            for (int j = 3; j <= i/3; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(i);
                c++;
            }
        }
        System.out.println(c);
    }

    public static void primeNumbers2(){
        System.out.println(2);
        boolean isPrime = true;
        int c = 0;
        for (int i = 3; i < 101; i+=2) {
            isPrime = true;
            for (int j = 3; j <= Math.sqrt(i); j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(i);
                c++;
            }
        }
        System.out.println(c);
    }

}
