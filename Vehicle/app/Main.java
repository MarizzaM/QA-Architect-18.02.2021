package com.app;

import com.new_app.Motorcycle;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Sentra", 120_000, "55_888_55", 1400, "Nissan",5);
        Motorcycle motorcycle = new Motorcycle("YBR125", 200_000, "99_666_99", 50, "Yamaha",2);
    }
}
// Airplane inherits from Aircraft