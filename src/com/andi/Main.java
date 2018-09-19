package com.andi;

import com.andi.interfaceIce.IceCream;
import com.andi.model.BasicIceCream;
import com.andi.model.VanillaIceCream;

public class Main {

    public static void main(String[] args) {
        IceCream basicIseCream = new BasicIceCream();
        System.out.println(basicIseCream.cost());

        // add vanilla to order
        IceCream vanilla = new VanillaIceCream(basicIseCream);
        System.out.println(vanilla.cost());
    }
}
