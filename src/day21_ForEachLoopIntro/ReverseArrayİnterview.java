package day21_ForEachLoopIntro;

import java.util.Arrays;

public class ReverseArrayİnterview {
    public static void main(String[] args) {

        int[] numbers ={10, 20, 30, 40, 50};
        int[] reversed = new int[numbers.length]; //{50, 40, 30, 20, 10}
//revers deyince tersten başlıyoruz.
        for (int i = numbers.length-1, j=0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
