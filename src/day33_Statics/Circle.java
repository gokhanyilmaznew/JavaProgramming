package day33_Statics;

public class Circle {
    // this custom class(Circle) it has one instance variable, two instance method, one static variable, one

    public double radius; //instance variable

    public static double pi = 3.14; // static variable

    public Circle(double radius) { //sağ tuş generate constructor
        this.radius = radius;
    }

    public double calcArea(){  //instance method
        return radius * radius * pi;
    }

    public double calcPerimeter() { //instance method
        return 2 * radius * pi;
    }

    public static void printPI (){ // static variable
        System.out.println(pi);
}

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
