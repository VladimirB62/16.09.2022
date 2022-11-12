package CharCounter;

import java.lang.reflect.Array;

public class CharCounterByDoubleArray {

    public static void charCounter(String str){

        String [] chCounter = new String[str.length()];
        int counter = 1;
        int index = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)){
                counter++;
            }else {
                chCounter[index] = String.valueOf(str.charAt(i - 1)) + String.valueOf(counter);
                counter = 1;
                index++;
            }
        }
        chCounter[index] = String.valueOf(str.charAt(str.length()-1)) + String.valueOf(counter);
        String summary = "";
        for (int i = 0; i <= index; i++) {
            summary += chCounter[i];
        }
        System.out.println(summary);
    }
}
