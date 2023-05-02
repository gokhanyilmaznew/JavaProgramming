package day07_Operators;

public class Castings {

    public static void main(String[] args) {
        float averageScore = 20.5f;
        byte num1 = (byte)averageScore; //EXPLİCİT CASTİNG
        short num2 = (short) averageScore; //EXPLİCİT CASTİNG
        int num3 = (int) averageScore; //EXPLİCİT CASTİNG
        float num4 = averageScore; //NO CASTİNG
        double num5 = averageScore;//İMPLİCİT CASTİNG
        long num6 = (long) averageScore;

         System.out.println("num1 =" + num1);
         System.out.println("num2 =" + num2);
         System.out.println(num3);

        /*
implicit casting: casting smaller type to larger type
  explicit casting: casting larger type to smaller type
         */


    }
}