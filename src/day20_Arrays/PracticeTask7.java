package day20_Arrays;
/*7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

 */

public class PracticeTask7 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        String common = "";

        for (int elearr1 : arr1) {
            for (int elearr2 : arr2) {
                if (elearr1 == elearr2) {
                    common += elearr1 + " ";

                }
            }
        }

        System.out.println(common);


    }
}



