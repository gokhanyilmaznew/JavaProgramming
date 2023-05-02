package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 18;
        String citizen = "USA";
       // 18 >= 18 "USA" == "USA"
        // true && true ==> true


        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name + " is eligible to vote: " + isEligible);


    }
}
