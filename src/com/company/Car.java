package com.company;

public class Car {

    Enginable enginable;

    public Car(Enginable engine){
        this.enginable = engine;
    }

    public Enginable getEngine() {
        return enginable;
    }

    public void drive() {
        getEngine().start();
    }

}
