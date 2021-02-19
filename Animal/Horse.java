package com.app;

public class Horse extends Animal{
    boolean racingHorse;

    public Horse(String name, boolean racingHorse) {
        super(name);
        this.racingHorse = racingHorse;
    }

    public void Neigh(){
        System.out.println("Neigh-Neigh");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "racingHorse=" + racingHorse +
                "} " + super.toString();
    }
}
