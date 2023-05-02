package day20_Arrays;
/*4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A

 */
public class PracticeTask4 {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= 100 && scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] < 90 && scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] < 80 && scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] < 70 && scores[i] >= 60) {
                grades[i] = 'D';
            } else if (scores[i] < 60) {
                grades[i] = 'F';
            }
        }

        for (int j = 0; j < scores.length; j++) {
            System.out.println(names[j] + "'s score is " + scores[j] + ", and grade is " + grades[j]);
        }


    }
}







