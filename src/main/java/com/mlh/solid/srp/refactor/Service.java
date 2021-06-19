package com.mlh.solid.srp.refactor;

import java.util.List;

public class Service {
    private ProductRepository productRepository;

    public Service(){
        this.productRepository = new ProductRepository();
    }

    public double calculateProductTax(Product product){
        if (product == null) return 0;

        double tax = 0.19;
        double productTax = product.price * tax;

        return productTax;
    }

    public boolean saveProduct(Product product){
        return this.productRepository.saveProduct(product);
    }

    public List<Product> listProducts(){
        return this.productRepository.listProducts();
    }

}
