package Main;

import car.Car;

public class main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Car("Vinfat", 200));
        Thread thread2 = new Thread(new Car("audi", 320));
        Thread thread3 = new Thread(new Car("Ferari", 300));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
