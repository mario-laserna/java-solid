package com.mlh.solid.srp.refactor;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private Connection masterConnection;
    private List<Product> products;  //usaremos esta lista para simular el guardado de productos

    public ProductRepository(){
        initDatabase();
        this.products = new ArrayList<>();

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
