package day13_String;

public class StringMethods { //charAt() method:

    public static void main(String[] args) {
        String word = "Cydeo";
        //index:01234

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar=" + thirdChar);
        /* char tenthChar = word.charAt(9);
        System.out.println("tenthCar= " +tenthChar);*/


        System.out.println("-------------------"); //length() method:

        String s1 = "Batch 25 is the best batch.Java Programming Language";

        int totalChars = s1.length();

        System.out.println("totalChars =" + totalChars);
        char lastChar = s1.charAt(s1.length() - 1);
        System.out.println("lastChar = " + lastChar);


        System.out.println("-------------------"); //toUpperCase() method:

        String str = "wooden spoon";
        str = str.toUpperCase(); //"WOODEN SPOON"

        System.out.println(str);

        String s = "JAVA";
        s = s.toLowerCase();

        System.out.println(s);

        System.out.println(str);
        //Today is a great day to learn java programming language.

        String sentence ="Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);

        String s5= "I love Java";
        //index:    012345
        String result4= s5.substring(2,6);
        System.out.println(result4);

        System.out.println("-----------------");

        String str4 = "Java";
        String r = str4.repeat(6);
        System.out.println(r);

        System.out.println("-------------");










    }
}