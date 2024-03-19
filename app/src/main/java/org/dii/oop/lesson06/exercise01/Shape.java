package app.src.main.java.org.dii.oop.lesson06.exercise01;

public class Shape {
    private String name;
    private double numSide;

    public Shape(String name,double numSide){
        this.name=name;
        this.numSide=numSide;
    }
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }
    public String getName(){
        return name;
    }
    public double getNumSides(){
        return numSide;
    }

}
