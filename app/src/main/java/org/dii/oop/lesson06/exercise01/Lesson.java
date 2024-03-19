package app.src.main.java.org.dii.oop.lesson06.exercise01;

import java.util.Scanner;
import java.util.ArrayList;
import app.src.main.java.org.dii.oop.lesson06.exercise01.Shape;

public class Lesson {
    public static void run() {
        ArrayList<Shape> shapes = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Square\n4. Display all apes\n5. Exit");
            System.out.print("Please select [1-5]: ");

            String choice = in.nextLine().trim();

            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                double radius = Double.parseDouble(in.nextLine());
                shapes.add(new Circle("Circle", radius));
            } else if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                double width = Double.parseDouble(in.nextLine());
                System.out.print("Enter height: ");
                double height = Double.parseDouble(in.nextLine());
                shapes.add(new Rectangle("Rectangle", width, height));
            } else if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                double side = Double.parseDouble(in.nextLine());
                shapes.add(new Square("Square", side));
            } else if ("4".equals(choice)) {
                System.out.println("List all apes:");
                for (Shape ape : shapes) {
                    System.out.println("Name: " + ape.getName() +
                            ", Number of sides: " + ape.getNumSides() +
                            ", Area: " + ape.getArea() +
                            ", Perimeter: " + ape.getPerimeter());
                }
            } else if ("5".equals(choice)) {
                break;
            }

        } while (true);

        in.close();
    }
}