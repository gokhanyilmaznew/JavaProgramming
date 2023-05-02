package day20_Arrays;

import java.util.Arrays;

public class task1 {

    public static void main(String[] args) {
/*1. create an array that has the numbers 1 to 100
	2. create an array that has the numbers 100 to 1
	3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
 */
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------");

        int[] num = new int[100];
        for (int i = num.length - 1; i >= 0; i--) {
            num[i] = num.length - i;
        }
        System.out.println(Arrays.toString(num));


        System.out.println("--------------------------");
    }
}






