package app.src.main.java.org.dii.oop.lesson06.exercise01;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name, 0); // Circle has 0 sides
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}