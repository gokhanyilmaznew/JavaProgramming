package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

 /* letters[0] = 'A';
 letters[1] = 'B';

  for (int i=0, j='A'; i < letters.length; i++, j++){ //i: index numbers 0~last index
letters[i] = (char)j;
}
 */
        char[] letters = new char[26];
        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch; // letters[i]=ch; ve sonra alt satıra ch++
            // letters[i]=ch++ veya direk i++ yanına ch++ ekleyerek
        }
        System.out.println(Arrays.toString(letters)); // [A~Z]

        }
    }
