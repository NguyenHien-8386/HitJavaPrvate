package car;

import customexception.BrokenCarException;

import java.util.Random;

public class Car implements Runnable {
    private String name;
    private double speed;
    private Random random = new Random();

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        try {
            for (int km = 0; km <= 30; km++) {
                if (random.nextInt(100) < 10) {
                    throw new BrokenCarException("xe: " + name + " bị nổ lốp !");
                }
                long sleepTime = 100 + random.nextInt((int) speed - 100 + 1);
                Thread.sleep(sleepTime);
                System.out.println("xe: " + name + " đã chạy được " + km + " km");
            }
            System.out.println("xe: " + name + " về đích");
        } catch (BrokenCarException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
