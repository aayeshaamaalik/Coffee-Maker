package org.example;

public class CoffeeMaker {
    public Coffee brew(CoffeePack pack) {
        Coffee base = pack.getBaseCoffee();

        for (String addOn : pack.getAddOns()) {
            switch (addOn.toLowerCase()) {
                case "milk": base = new Milk(base); break;
                case "soy": base = new Soy(base); break;
                case "mocha": base = new Mocha(base); break;
                default: break;
            }
        }

        return base;
    }
}

