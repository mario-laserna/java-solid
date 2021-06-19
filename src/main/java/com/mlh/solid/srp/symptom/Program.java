package com.mlh.solid.srp.symptom;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Service service = new Service();

        Product product = new Product();
        product.setProductId(1);
        product.setName("product 1");
        product.setPrice(10);

        System.out.println(service.calculateProductTax(product));

        service.saveProduct(product);

        List<Product> products = service.listProducts();
        for (Product p : products) {
            System.out.println("Id " + p.productId + " name: " + p.name);
        }
    }

}
