package bai1;

import java.util.Scanner;

public class AuthService {
    private UserService userService = new UserService();

    //hàm đăng kí
    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập username đăng kí: ");
        String tk = sc.nextLine();
        System.out.print("nhập password đăng kí: ");
        String mk = sc.nextLine();
        System.out.print("Nhập email đăng kí: ");
        String gmail = sc.nextLine();
        System.out.print("Nhập số điện thoại đăng kí: ");
        String sdt = sc.nextLine();
        User newUser = new User(mk, tk, gmail, sdt);
        userService.addUser(newUser);
        System.out.println("đăng ký thành công !");
    }

    //hàm đng nhập
    public boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập username đăng nhập: ");
        String username = sc.nextLine();
        System.out.print("Nhập password đăng nhập: ");
        String password = sc.nextLine();
        for (User user : userService.getAllUsers()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Đăng nhập thành công!");
                System.out.println("id của bạn là: " + user.getId());
                userMenu();
                return true;
            }
        }

        System.out.println("Sai tài khoản hoặc mật khẩu!");
        return false;
    }

    //hàm logic menu user
    public void userMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("  --- Menu Usser ---");
            System.out.println("+---------------------+");
            System.out.println("| 1. Get user by id.  |");
            System.out.println("| 2. Get all user.    |");
            System.out.println("| 3. Change password. |");
            System.out.println("| 4. log out.         |");
            System.out.println("+---------------------+");
            System.out.print("nhập lựa chọn: ");
            String chon = sc.nextLine();
            switch (chon) {
                case "1":
                    System.out.println("1. Get user by id.");
                    System.out.println("nhập id cầ tìm: ");
                    String iD = sc.nextLine();
                    User u = userService.getUserById(iD);
                    if (u != null) {
                        System.out.println(u);
                    } else {
                        System.out.println("không tìm thấy người dùng");
                    }
                    break;
                case "2":
                    System.out.println("2. Get all user.");
                    for (User user : userService.getAllUsers()) {
                        System.out.println(user);
                    }
                    break;
                case "3":
                    System.out.println("3. Change password.");
                    changePassword();
                    break;
                case "4":
                    System.out.println("4. Log out. ");
                    System.out.println("Đăng xuất thành công.");
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ !");
            }
        }
    }

    //hàm đổi mk
    public void changePassword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID người cần đổi mật khẩu: ");
        String id = sc.nextLine();
        User user = userService.getUserById(id);
        System.out.print("nhập mật khẩu mới: ");
        String newpassword = sc.nextLine();
        System.out.print("nhập lại mật khẩu mới: ");
        String newPassword = sc.nextLine();
        if (newpassword.equals(newPassword)) {
            user.setPassword(newpassword);
            System.out.println("đổi mật khẩu thành công ! ");
        } else {
            System.out.println("mật khẩu xác nhận không chính xác !");
        }
    }
}
