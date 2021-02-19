package com.app;

public class Poodle extends Dog {
    protected String numberOfPonnyTails;

    public Poodle(String name, String favoriteDogFood, String numberOfPonnyTails) {
        super(name, favoriteDogFood);
        this.numberOfPonnyTails = numberOfPonnyTails;
    }

    @Override
    public void Bark() {
        System.out.println("Hav-Hav");
    }

    @Override
    public String toString() {
        return "Poodle{" +
                "numberOfPonnyTails='" + numberOfPonnyTails + '\'' +
                "} " + super.toString();
    }
}
