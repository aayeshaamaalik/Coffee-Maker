package org.example;

import java.util.List;

public class CoffeePack {
    private Coffee baseCoffee;
    private List<String> addOns;

    public CoffeePack(Coffee baseCoffee, List<String> addOns) {
        this.baseCoffee = baseCoffee;
        this.addOns = addOns;
    }

    public Coffee getBaseCoffee() {
        return baseCoffee;
    }

    public List<String> getAddOns() {
        return addOns;
    }
}

