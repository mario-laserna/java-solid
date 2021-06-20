package com.mlh.solid.ocp.refactor;

public class Program {

    public static void main(String[] args) {
        Store store = new Store();

        Order order1 = new Order();
        order1.setCountry(CountryEnum.Mexico);
        order1.setTotal(8000);
        order1.setWeight(1);

        Order order2 = new Order();
        order2.setCountry(CountryEnum.Colombia);
        order2.setTotal(100000);
        order2.setWeight(10);

        double costOne = store.calculateDeliveryCost(order1);
        System.out.println("Order 1 cost: " + costOne);

        double costTwo = store.calculateDeliveryCost(order2);
        System.out.println("Order 2 cost: " + costTwo);

    }
}
