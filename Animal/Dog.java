package com.app;

public class Dog extends Animal{
    protected String favoriteDogFood;

    public Dog(String name, String favoriteDogFood) {
        super(name);
        this.favoriteDogFood = favoriteDogFood;
    }

    public void Bark(){
        System.out.println("Woof-Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "favoriteDogFood='" + favoriteDogFood + '\'' +
                "} " + super.toString();
    }
}
