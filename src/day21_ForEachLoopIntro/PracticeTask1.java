package day21_ForEachLoopIntro;

import java.util.Arrays;

public class PracticeTask1 {
    /* 1. Write a program that sort the array of integer in descending order
     */
    public static void main(String[] args) {

        int[] numbers = {8, 5, 4, 2, 9, 1, 7, 3, 6};
        Arrays.sort(numbers);

        int[] numDescend = new int[numbers.length];
        int j = 0;

        for (int i = numbers.length - 1; i >= 0; i--, j++) {
            numDescend[j] = numbers[i];
        }

        System.out.println(Arrays.toString(numDescend));
    }

}


