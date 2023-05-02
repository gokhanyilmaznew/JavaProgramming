package day30_CustomClass;


public class Dog { // public keyword /class keyword/ name of class (Dog)
 // ilk önce Attributes (Fields) yazılıyor sonra Actions(Methods)

    public String name ; //Bunlar instance variables name
    public String breed ;
    public char gender;
    public String size ;
    public int age ;
    public String color ;


public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor) {
    name = dogName;
    breed = dogBreed;
    age = dogAge;
    gender =dogGender;
    size = dogSize;
}

    public void eat(){
        System.out.println(name + " is eating ");
    }

    public void drink(){
        System.out.println(name + " is drinking ");
    }

    public void play(){
        System.out.println(name + " is playing ");
    }

    public void bark() {
        System.out.println(name + " is barking ");
    }
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes:
    name, age, gender, breed, size, color

Actions:
    eat(), play(), bark(), drink() ....

*/