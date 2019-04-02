package com.codegym;

public class App {

        public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
            for (Animal animal : animals) {
                System.out.println(animal.makeSound());

                if (animal instanceof Chicken) {
                    Edible edibler = (Chicken) animal;
                    System.out.println(edibler.howToEat());
                }
            }
            Edible [] edibles =new Edible[3];
            edibles[2] =new Chicken();
            edibles[1]=new Apple();
            edibles[0]=new Orange();
            for (Edible edible:edibles
                 ) {
                System.out.println(edible.howToEat());
                if (edible instanceof Chicken){
                    System.out.println(((Chicken) edible).makeSound());
                }

            }
        }

}
