package day13_String;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        scan.nextLine();
        System.out.println("Enter your Full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your Phone number: ");
        long phone = scan.nextLong();

        System.out.println("Enter your Zip code: ");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your School Name: ");
        String schoolName = scan.nextLine();

        System.out.println("Enter your City name: ");
        String city= scan.nextLine();

        System.out.println("Enter your State name: ");
        String state= scan.next();

        System.out.println("Enter your building Number: ");
        int buildingNum = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your Street name: ");
        String street = scan.nextLine();


        System.out.println("Full name: " +fullName);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Phone number: " +phone);
        System.out.println("Adress: \n\t" +buildingNum+ ""+street+"\n\t"+city+","+state+""+zipCode);
        System.out.println("School name: " +schoolName);

    }
}
//Display all the inputs that user entered in following order in sperate lines:
//
//			1. full name
//			2. age
//			3. gender
//			4. phone number
//			5. address:
//						buildingNumber Street
//						City, State ZipCode