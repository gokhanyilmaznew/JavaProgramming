package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {

        String str = "     ";
        boolean r1 = str.isEmpty();
        System.out.println(r1);

        System.out.println("---------------");

        String str2 = "     ";
        boolean r2 = str2.isBlank();
        System.out.println(r2);

        System.out.println("---------------");

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("-------------");

                String word1= "JAVA";
                String word2 = "java";
        System.out.println(word1.equals(word2));
        System.out.println(word1.equalsIgnoreCase(word2));

        System.out.println("-------------");

        String sentence = "I love Java programming language";
        boolean hasCSharp = sentence.contains("C#");
        System.out.println("hasCSharp = " + hasCSharp);

        boolean hasJava = sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);

        System.out.println("-------------");

        




    }





}


