package com.codegym;

public class Chicken extends Animal implements Edible{
    public Chicken() {
    }

    @Override
    String makeSound() {
        return  " ÒóoÒ ";
    }

    @Override
    public String howToEat() {
        return " could be boiled";
    }
}
