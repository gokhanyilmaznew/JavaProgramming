package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int division = num1 / num2; //division variable contains the result of num1 divided by num2
        int remainder = num1 % num2; //remainder variable contains the remainder of num1 divided by number
        //10 divide by 3 is equal to 3 with a remainder of 1

        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);

// what is the remainder of divided 4 :

        System.out.println( 25 % 4);
        System.out.println( 25 % 5);
    }
}




//remainder = 10 - ( 3 * 3 ) = 11/3 = 0.3333..
// 10 % 3==> 1
// 45/8 = 5.625
// 45 - ( 8 * 5 ) = 5
// 45 % 8 ===> 5
// 100 % 15 ===> 10
// 100 / 15 = 6.66...
// 100 - (15 * 6) = 10 //