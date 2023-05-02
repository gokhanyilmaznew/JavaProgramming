package day21_ForEachLoopIntro;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers ={10, 5, 20, 1, 0};
        int max =numbers[0]; //10 first element max number assumed (farzedildi)
/*
        //for (int i = numbers.length - 1; i >= 0; i--) { //last index için numbers.forr yapınca otomatik

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] > max){ //if there is element in the array that's greater than the current max number
                max = numbers[i]; //assigning greater number to variable max
            }
        }

 */
        for (int number : numbers) {
            if(number > max){
                max = number;
        }
        }
        System.out.println(max);
    }
}






