package day21_ForEachLoopIntro;

/*6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
*/

   public class PracticeTask6 {
       public static void main(String[] args) {

           String[] array = {"Java", "Java", "Python", "C++", "Java", "Python"};
           int countJava = 0;
           int countPython = 0;

           for (String each : array) {
               if (each.equalsIgnoreCase("java")) {
                   countJava++;
               }
               if (each.equalsIgnoreCase("python")) {
                   countPython++;
               }
           }
           System.out.println("There are " + countJava + " Java in this Array");
           System.out.println("There are " + countPython + " Python in this Array");
       }

   }









