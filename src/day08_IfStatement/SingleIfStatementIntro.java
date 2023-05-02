package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        int number = 300;

        /* ......*/

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber; // not even number


        if (evenNumber) { // even number , true
            System.out.println(number + " is even number");
        }
        if (oddNumber) {// odd number   , false
            System.out.println(number + " is odd number");


        }

    }

}
