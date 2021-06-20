package com.mlh.solid.ocp.refactor.delivery;

import com.mlh.solid.ocp.refactor.Order;

public class ColombiaDelivery implements IDelivery{

    @Override
    public double calculatecost(Order order) {
        double result = order.total * 0.01;

        if (order.getWeight() <= 2) {
            result += 9900;
        } else {
            result += order.getWeight() * 5000;
        }

        return result;
    }
}
