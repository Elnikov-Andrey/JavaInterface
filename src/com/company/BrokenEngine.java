package com.company;

public class BrokenEngine implements Enginable {

    @Override
    public void start() {
        System.out.println("Broke");
    }

}
