package hometasks.task3;

public class Vehicle {

    double price;
    int speed;
    int year;

    public Vehicle() {

        price = 1500;
        speed = 180;
        year = 2020;

    }

}

class Plane extends Vehicle{

    int height;
    int count;

    public Plane(int height, int count) {
        this.height = height;
        this.count = count;
    }

    @Override
    public String toString() {
        return "price = " + price + " speed = " + speed + " year = " + year + " count = " + count + " height = " + height;
    }
}

class Car extends Vehicle{

    @Override
    public String toString() {
        return "price = " + price + " speed = " + speed + " year = " + year;
    }
}

class Ship extends Vehicle{
    int count;
    String port;

    public Ship(int count, String port) {
        this.count = count;
        this.port = port;
    }

    @Override
    public String toString() {
        return "price = " + price + " speed = " + speed + " year = " + year + " count = " + count + " port = " + port;
    }
}