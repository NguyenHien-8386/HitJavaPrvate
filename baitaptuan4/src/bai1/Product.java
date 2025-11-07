package bai1;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;

    public Product() {
    }

    public Product(String name, String description, double price) {
        this.id = (int) (Math.random()*10000);
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getByID(int id) {
        if (this.id == id) {
            return this;
        }
        return null;
    }

    public String getInfo() {
        return "id: " + id + ", Tên: " + name + ", Mô tả: " + description + ", Giá bán: " + price;
    }
}
