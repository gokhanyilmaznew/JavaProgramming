package day12_Scanner;
import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //boolean result = input.nextBoolean();
        //System.out.println("Enter true or false: ");

        System.out.println("Enter your name: ");
        String name = input.next(); //Java

        System.out.println("name = " + name);
        input.close();






    }
}