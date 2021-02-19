package com.app;

public class Wolf extends Dog{
    protected String nameOfPack;

    public Wolf(String name, String favoriteDogFood, String nameOfPack) {
        super(name, favoriteDogFood);
        this.nameOfPack = nameOfPack;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "nameOfPack='" + nameOfPack + '\'' +
                "} " + super.toString();
    }
}
