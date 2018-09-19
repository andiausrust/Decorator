package com.andi.model;

import com.andi.interfaceIce.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.print("creating a basic icecream ");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
