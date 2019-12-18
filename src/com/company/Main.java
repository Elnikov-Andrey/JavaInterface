package com.company;

public class Main {

    public static void main(String[] args) {

        Enginable sportEngine = new SportEngine();
        Enginable brokenEngine = new BrokenEngine();

        Car SportCar = new Car(sportEngine);
        Car BrokenCar = new Car (brokenEngine);

        SportCar.drive();
        BrokenCar.drive();

    }
}
