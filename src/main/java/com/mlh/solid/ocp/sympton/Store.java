package com.mlh.solid.ocp.sympton;

public class Store {

    public double calculateDeliveryCost(Order order){
        if (order == null) return -1;

        double result = 0;

        switch (order.country) {
            case Colombia -> {
                result = order.total * 0.01;
                if (order.getWeight() <= 2) {
                    result += 9900;
                } else {
                    result += order.getWeight() * 5000;
                }
            }
            case Mexico -> result = 98;
        }

        return result;
    }

}
