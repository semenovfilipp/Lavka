package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "Грецкий орех", "Грецкий орех, ядро", 300, 1000,"ИП Мария Николаевна"));
        products.add(new Product(++ID, "Ядра подсолнуха", "Семена подсолнуха очищенные", 50, 100, "СНТ Садоводство"));
    }

    public List<Product> listProducts() { return products; }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}