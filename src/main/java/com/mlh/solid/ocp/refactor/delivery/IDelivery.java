package com.mlh.solid.ocp.refactor.delivery;

import com.mlh.solid.ocp.refactor.Order;

public interface IDelivery {
    double calculatecost(Order order);
}
