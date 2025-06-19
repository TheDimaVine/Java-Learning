package week1;

public class Car {
    private String name;
    private String color;
    private double speed;

    public Car(String name, String color, double speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void drive() {
        System.out.println("Машина: " + name + " поехала.");
    }

    public static void main(String[] args) {
        Car bmw = new Car("BMW X5", "Red", 125);
        Car audi = new Car("Audi 2025", "Blue", 90);

        bmw.drive();
        audi.drive();
    }
}
