package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;


    //sağ tuş-generate-setInfo method
    public void setInfo(String name, char gender,  int age, int ID, char grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.ID = ID;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';

    }

    public void code(){
        System.out.println(name +" is coding");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}



