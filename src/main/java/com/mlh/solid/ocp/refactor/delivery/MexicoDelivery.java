package com.mlh.solid.ocp.refactor.delivery;

import com.mlh.solid.ocp.refactor.Order;

public class MexicoDelivery implements IDelivery{

    @Override
    public double calculatecost(Order order) {
        return 98;
    }
}
