package day21_ForEachLoopIntro;

public class PracticeTask2 {

    /* 2. Write a program that can count the even and odd number from an array of integers
    Note: MUST use for each loop
    */

    public static void main(String[] args) {
        int [] numbers= {10, 12, 15, 18, 20, 25, 28, 30};
        int numEven=0;
        int numOdd=0;

        for (int each : numbers) {
            if (each%2==0){
                numEven++;
            }else{
                numOdd++;
            }
        }

        System.out.println("numOdd = " + numOdd);
        System.out.println("numEven = " + numEven);

        System.out.println("------------------------------");








    }
}






