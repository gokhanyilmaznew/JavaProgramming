package day21_ForEachLoopIntro;


import java.util.Scanner;

/*4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */
    public class PracticeTask4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String [] array = new String[5];
        System.out.println("Enter a words");

        for (int i = 0; i < 5; i++) {
            array[i] = scan.next();
        }
        int count = 0;

        for (String each : array) {
            String rev = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                rev+=each.charAt(i);
            }
            if(each.equals(rev)){
                count++;
            }
        }
        System.out.println( count);
    }

}



