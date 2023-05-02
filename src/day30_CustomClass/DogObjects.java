package day30_CustomClass;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog (); //this is an object created
        dog1.name = "Lucy";
        dog1.breed ="Husky";
        dog1.size = "Large";
        dog1.age = 5;
        dog1.color ="White";
        dog1.gender ='F';


        Dog dog2 = new Dog();
        dog2.name ="Max";
        dog2.breed = "German Shepherd";
        dog2.size = "Small";
        dog2.age = 1;
        dog2.color = "Black";
        dog2.gender = 'M';


        Dog dog3 = new Dog(); //yukardakinin aynısı aşağıda basitçe setInfo method
        dog3.setInfo("Jack", "German Shepherd", 2, 'M', "Large","Black");


        System.out.println(dog1); //run yapınca hascode veriyor, ı need to generate toString method
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.play();
        dog3.bark();


    }

}
