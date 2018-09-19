package com.andi.model;

import com.andi.interfaceIce.IceCream;
import com.andi.interfaceIce.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.print("Adding Mint to Ice-Cream ");
        return 1.50 + super.cost();
    }
}
