package org.example;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float cost() {
        return coffee.cost() + 0.5f;
    }
}
