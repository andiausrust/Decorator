package com.andi.model;

import com.andi.interfaceIce.IceCream;
import com.andi.interfaceIce.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.print("adding vanilla ");
        return 1.0 + super.cost();
    }
}
