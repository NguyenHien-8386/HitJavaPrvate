package bai1;

public class SmartPhone extends Product {
    private boolean has5G;

    public SmartPhone() {
        super();
        this.has5G = false;
    }

    public SmartPhone(String Name, String Description, double Price, boolean has5G) {
        super(Name, Description, Price);
        this.has5G = has5G;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "có hỗ trợ 5G: " + (has5G ? "có" : "không");
    }
}

