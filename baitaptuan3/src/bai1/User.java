package bai1;


public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;


    public User() {
    }

    public User(String password, String username, String email, String phoneNumber) {
        this.id = username + (1000 + (int) (Math.random()) * 90000);
        this.password = password;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format(" Id người dùng: %s \t|tên người dùng: %s \t| mật khẩu: %s \t| Email: %s \t| Số điện thoại: %s", this.id, username, password, email, phoneNumber);
    }

}

