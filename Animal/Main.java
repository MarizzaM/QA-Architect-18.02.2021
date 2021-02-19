package com.app;

public class Main {

    public static void main(String[] args) {

        Horse appaloosa = new Horse("Appaloosa Horse", true);
        Poodle cockapoo = new Poodle("Cockapoo", "Pedigree", "one");
        Wolf redWolf = new Wolf("Red Wolf", "Meat", "Reds wolves");

        System.out.println(appaloosa);
        appaloosa.Neigh();
        System.out.println(cockapoo);
        cockapoo.Bark();
        System.out.println(redWolf);
        redWolf.Bark();
    }
}
