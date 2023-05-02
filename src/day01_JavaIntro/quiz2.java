package day01_JavaIntro;

public class quiz2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }


        int number = 5;
        while (number < 100) {
            number += number;
        }
        System.out.println(number);


        int a = 0;
         do {
             a = a++ + --a - (a % 3);
         } while ( ++a < 4  );
        System.out.println(a);
         }







    }


