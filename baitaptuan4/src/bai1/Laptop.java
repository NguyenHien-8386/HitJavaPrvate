package bai1;

public class Laptop extends Product {
    private String ram;
    private String cpu;

    public Laptop(String name, String description, double price) {
        super();
    }

    public Laptop(String Name, String Description, double Price, String ram, String cpu) {
        super(Name, Description, Price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Ram: " + ram + ", Cpu: " + cpu;
    }
}
