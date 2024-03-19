package app.src.main.java.org.dii.oop.lesson06.exercise02;
import app.src.main.java.org.dii.oop.lesson06.exercise01.Shape;
import java.util.*;


    public class CustomArrayList<T> extends ArrayList<T> {
        // Function to print details of all shapes
        public void listAllShapes() {
            for (T shape : this) {
                System.out.println(shape.toString()); // Assuming shape classes have overridden toString() method
            }
        }

        // Function to calculate and print the sum of areas of all shapes
        public void sumArea() {
            double totalArea = 0.0;
            for (T shape : this) {
                if (shape instanceof Shape) {
                    totalArea += ((Shape) shape).getArea();
                }
            }
            System.out.println("Summation of area is " + totalArea);
        }
    }


