package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

    Employee employee1 = new Employee("Josh", 'M', "SDET", 100000);
    Employee employee2 = new Employee("Shay", 'F', "QA", 110000 );

    System.out.println(employee1);
    System.out.println(employee2);


    }
}
