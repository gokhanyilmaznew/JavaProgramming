package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names
    //System.out.println(myGroup); //hascode default value veriyor
   String[] myGroup = new String[5]; // 0  ~ 4

        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        //myGroup[5] = "Muhtar";

        System.out.println(Arrays.toString(myGroup)); //["Gunay", "Neira", "Suat", "Hulya", "Mikael"]
        //default value veriyor, no object giving demek ..[null, null, null,null] diye string olduğu için (non-primitive de bu )








    }







}
