package app.src.main.java.org.dii.oop.lesson06.exercise01;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name, 4); // Rectangle has 4 sides
        this.width = width;
        this.height = height;
    }


    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2 * (width + height);
    }
}

