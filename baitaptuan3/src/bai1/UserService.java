package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    private ArrayList<User> users = new ArrayList<>();

    public UserService() {
    }


    public void inputUsers() {
        Scanner sc = new Scanner(System.in);
        int dem = 1;
        System.out.println("=== NHẬP DANH SÁCH NGƯỜI DÙNG ===");
        while (true) {
            System.out.println("Người dùng thứ " + dem + ":");
            System.out.print("Nhập username: ");
            String username = sc.nextLine();
            System.out.print("Nhập password: ");
            String password = sc.nextLine();
            System.out.print("Nhập email: ");
            String email = sc.nextLine();
            System.out.print("Nhập số điện thoại: ");
            String phone = sc.nextLine();
            users.add(new User(username, password, email, phone));
            System.out.print("bạn có muốn nhập thêm (Yes/No): ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("yes")) {
                System.out.println("mời bạn nhập tiếp !");
                dem++;
            } else {
                System.out.println("~~~~~~~~");
                return;
            }
        }
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getId().equalsIgnoreCase(userId)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }
}
