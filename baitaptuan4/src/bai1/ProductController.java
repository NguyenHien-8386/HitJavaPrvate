package bai1;

import java.util.ArrayList;

public class ProductController {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(String type, String name, String description, double price) {
        Product product = null;
        if (type.equalsIgnoreCase("lapTop")) {
            product = new Laptop(name, description, price);
        } else if (type.equalsIgnoreCase("SmartPhone")) {
            product = new SmartPhone(name, description, price, false);
        } else {
            System.out.println("không có sản phẩm: " + type);
        }
        products.add(product);
        System.out.println("đã thêm sản pẩm: " + product.getInfo());
    }

    public void getAllProducts() {
        for (Product pr : products) {
            System.out.println(pr.getInfo());
        }
    }
}


