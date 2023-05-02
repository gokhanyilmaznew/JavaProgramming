package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
            }

        }
        System.out.println(list);

        System.out.println("-----------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf(name -> StringUtility.isPalindrome(name));

        // eğer no palindrome deseydi  names.removeIf(name -> !StringUtility.isPalindrome(name)); olacaktı
        System.out.println(names);
}
}









