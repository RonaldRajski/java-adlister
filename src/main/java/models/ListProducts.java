package models;

import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products{

    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> all() {
        insert(new Product("hammer", 9.99));
        insert(new Product("tape", 5.99));
        insert(new Product("drill", 19.99));

    }

    public void insert(Product product){
        this.products.add(product);

    }

    public List<Product> all() {
        return this.products;
    }
}
