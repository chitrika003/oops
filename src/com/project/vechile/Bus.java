package com.project.vechile;

import java.util.Scanner;

public class Bus extends AbstractVechile {

    private String color;
    private String bus_number;
    private int capacity;

    @Override
    void run() {
        System.out.println("The Bus Runs on Diesel");
    }

    @Override
    public void fuleType() {

    }

    @Override
    public int capatcity() {
        return 0;
    }
}
