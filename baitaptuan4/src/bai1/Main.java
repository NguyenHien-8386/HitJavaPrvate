package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm Laptop");
            System.out.println("2. Thêm SmartPhone");
            System.out.println("3. Xem danh sách sản phẩm");
            System.out.println("0. Thoát");
            System.out.println("mời bạn nhập lựa chọn: ");
            String chon = sc.nextLine();
            switch (chon) {
                case "1":
                    System.out.println("1. thêm laptop");
                    System.out.println("Nhập tên laptop: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập mô tả: ");
                    String description = sc.nextLine();
                    System.out.println("Nhập giá bán: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nhập thông số ram: ");
                    String ram = sc.nextLine();
                    System.out.println("Nhập thông số cpu: ");
                    String cpu = sc.nextLine();
                    Laptop laptop = new Laptop(name, description, price, ram, cpu);
                    productController.addProduct(laptop);
                    System.out.println("đã thêm laptop thành công !");
                    break;
                case "2":
                    System.out.println("2. Thêm SmartPhone");
                    System.out.print("Nhập tên SmartPhone: ");
                    String Name = sc.nextLine();
                    System.out.print("Nhập mô tả: ");
                    String desc = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double Price = Double.parseDouble(sc.nextLine());
                    System.out.print("Có hỗ trợ 5G không? (true/false): ");
                    boolean has5G = Boolean.parseBoolean(sc.nextLine());
                    SmartPhone smartPhone = new SmartPhone(Name, desc, Price, has5G);
                    productController.addProduct(smartPhone);
                    System.out.println("đã thêm smartphone !");
                    break;
                case "3":
                    System.out.println("Xem toàn bộ danh sách sản phẩm");
                    productController.getAllProducts();
                    break;
                case "0":
                    System.exit(0);
            }
        }
    }
}
