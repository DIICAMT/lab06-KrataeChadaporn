package app.src.main.java.org.dii.oop.lesson06.exercise02;
import app.src.main.java.org.dii.oop.lesson06.exercise01.Circle;
import app.src.main.java.org.dii.oop.lesson06.exercise01.Rectangle;
import app.src.main.java.org.dii.oop.lesson06.exercise01.Shape;
import app.src.main.java.org.dii.oop.lesson06.exercise01.Square;
import java.util.*;


public class Lesson {
    public static void run() {
        CustomArrayList<Shape> shapes = new CustomArrayList<>();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Square\n4. Display all shapes\n5. Show summation of area\n6. Exit");
            System.out.print("Please select [1-6]: ");

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
                System.out.println("List all shapes:");
                shapes.listAllShapes();
            } else if ("5".equals(choice)) {
                System.out.print("Summation of area: ");
                shapes.sumArea();
            } else if ("6".equals(choice)) {
                break;
            }

        } while (true);

        in.close();
    }
}
