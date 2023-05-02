package day14_String;

public class practice {
    public static void main(String[] args) {

        String s5= "I love Java";
        //index:    012345
        String result4= s5.substring(2,6);
        System.out.println(result4);

        System.out.println("---------------");


        String str8 ="I love Java, Java is the best programming language";
        str8 = str8.replaceFirst("Java","C#");
        System.out.println(str8);

        String str9 = "Java Programming Language";
        String resultt=str9.substring(str9.indexOf("P") );
        System.out.println(resultt);

        System.out.println("-------------");

       String name = "Wooden Spoon";

       boolean result = name.startsWith("Wood");
          System.out.println(result);

         boolean result1 = name.startsWith("Spoon");
         System.out.println(result1);

        System.out.println( "------------");

        boolean result2 = name.endsWith("Spoon");
        System.out.println(result2);



    }



}

