package com.mlh.solid.ocp.refactor;

import com.mlh.solid.ocp.refactor.delivery.Factory;
import com.mlh.solid.ocp.refactor.delivery.IDelivery;

public class Store {

    public double calculateDeliveryCost(Order order){
        if (order == null) return -1;

        IDelivery delivery = Factory.instance().get(order.country);
        return delivery.calculatecost(order);
    }
}
