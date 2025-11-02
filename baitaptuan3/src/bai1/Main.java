package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthService authService = new AuthService();
        while (true) {
            System.out.println("-- quản lý người dùng --");
            System.out.println("+----------------------------+");
            System.out.println("| 1. đăng ký tài khoản.      |");
            System.out.println("| 2. đăng nhập.              |");
            System.out.println("| 3. kết thúc.               |");
            System.out.println("+----------------------------+");
            System.out.print("nhập lựa chọn: ");
            String chon = sc.nextLine();
            switch (chon) {
                case "1":
                    authService.register();
                    break;
                case "2":
                    authService.login();
                    break;
                case "3":
                    System.out.println("bạn muốn kết thúc (Yes/No): ");
                    String da = sc.nextLine();
                    if (da.equalsIgnoreCase("Yes")) {
                        System.out.println("đã đóng chương trình !");
                        System.exit(0);
                    } else {
                        System.out.println("tiếp tục chương trình !");
                    }
                    break;
                default:
                    System.out.println("EROR !!!!!");
            }
        }
    }
}
