package day20_Arrays;

public class PracticeTask1 {
  /*1. create an array named classmates, and store 10 of your classmates' full names
           print the initials of each classmates in separate lines
*/
  public static void main(String[] args) {

    String[] names = {"Marcel Proust", "Zygmunt Bauman", "Kurt Cobain", "Emile Durkheim", "Sigmund Freud", "Mark Twain", "Harper Lee", "Truman Capote", "Haruki Murakami", "Oscar Wilde"};

    for (int i = 0; i < names.length; i++) {

      System.out.println(names[i].charAt(0) + "." + names[i].charAt(names[i].indexOf(" ")+1)+ ".");
      // Because each name returns to String, we can use string methods here.
    }
  }
}

