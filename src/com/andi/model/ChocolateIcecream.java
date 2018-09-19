package com.andi.model;

import com.andi.interfaceIce.IceCream;
import com.andi.interfaceIce.IceCreamDecorator;

public class ChocolateIcecream extends IceCreamDecorator {
    public ChocolateIcecream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.print("Adding chocolat ");
        return 1.0 + super.cost();
    }
}
