package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
    //assigment: =
         int number = 100;

         System.out.println("number=" + number); //100
        number = 200;

         System.out.println("number=" + number); //200

        String word = "Java Programming";

        System.out.println("word =" + word); // Java Programming

         word = "Wooden Spoon";

        System.out.println("word = " + word);// Wooden spoon

         word = "Cydeo";

        System.out.println("word=" + word); // Cydeo

        word = " Java Programming"; //regular variable

        System.out.println("word=" + word);

        word = "123" + 1 ; //1231

        System.out.println("-----------------------------");

        //Addition Assigment:
          int x = 100;
        System.out.println("x = " + x);

        System.out.println(x + 200); //300

        // X = X + 200;

        x += 200;
        System.out.println("x = " + x);
String str = "Wooden";
str += "Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 = " + num1); // 2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1);// 8

       double availableBalance = 1000.50;

       // deposit 300$

        availableBalance += 300; // availableBalance = 1000.50 + 300

        System.out.println("availableBalance = " + availableBalance); //1300.5

        System.out.println("----------------------------");
        //withdrawing 500$

        availableBalance -= 500; // availableBalance = 1300.5 - 500 ;

        System.out.println("availableBalance = " + availableBalance);

//withdrawing 200$, then depositing 400$

        availableBalance -= 200; // available balance = 600.5
        availableBalance += 400; // available balance = 1000.5

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------------");

        double salary = 50000.50;

        System.out.println("salary = " + salary);

        salary *= 2; //salary = salary * 2

        System.out.println("salary =" + salary);

        double doge = 0.00000001;
        doge *= 1000000;

        System.out.println("doge = " + doge);

        System.out.println("----------------------------");

        double num2 = 25000.0;

        //num2 = num2 /2;

        num2 /= 2;

        System.out.println(" num2 = " + num2);


        System.out.println("----------------------------");

        double num3 = 100;

        //%=

        num3 %=3;

        System.out.println("num3 =" + num3);
        System.out.println("----------------------------");








    }





}
