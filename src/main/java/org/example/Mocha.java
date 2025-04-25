package org.example;

public class Mocha extends CoffeeDecorator {
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float cost() {
        return coffee.cost() + 0.6f;
    }
}
