package com.mlh.solid.srp.symptom;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private Connection masterConnection;
    private List<Product> products;  //usaremos esta lista para simular el guardado de productos

    public Service() {
        initDatabase();

        this.products = new ArrayList<>();
    }

    public double calculateProductTax(Product product){
        if (product == null) return 0;

        double tax = 0.19;
        double productTax = product.price * tax;

        return productTax;
    }

    public boolean saveProduct(Product product){
        // logica para validar datos

        // logica para guardar en base de datos

        this.products.add(product);

        return true;
    }

    public List<Product> listProducts(){
        // logica para consultar en base de datos un listado de productos

        return this.products;
    }

    private void initDatabase() {
        // Logica para establecer conexión y crear tabla
    }
}
