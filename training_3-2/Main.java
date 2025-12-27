class Car {
    String brand;
    int year;
}

public class Main {
    public static void main(String args[]) {

        Car myCar = new Car();   
        myCar.brand = "Toyota";   
        myCar.year = 2020;

        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);
    }
}