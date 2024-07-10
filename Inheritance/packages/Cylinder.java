package Inheritance.packages;

public class Cylinder extends Circle{
    double height;

    public Cylinder(String color, String texture, double radius, double height){
        super(color, texture, radius);
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

}