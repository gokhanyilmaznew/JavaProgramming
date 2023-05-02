package day05_Concatenation;

public class ShippingAdres {

    public static void main(String[] args) {

        String name = "James King";
        String buildingNumber = "1123B";
        String streetName = "Jones Branch Dr";
        String city = "Mclean";
        String state = "VA";
        String zipCode = "22031A";
        //System.out.println(name + "\n" + buildingNumber +" " streetName + "\n" + city + ", " "\n" + state + " " + zipCode);

        String adress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(adress);


    }

    }


