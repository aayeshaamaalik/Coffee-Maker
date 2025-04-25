package org.example;

public class Soy extends CoffeeDecorator {
    public Soy(Coffee coffee) {
        super(coffee);
    }

    @Override
    public float cost() {
        return coffee.cost() + 0.4f;
    }
}

