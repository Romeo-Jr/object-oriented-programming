package Inheritance.packages;

public class Circle extends Shape{
    double radius;

    public Circle(String color, String texture, double radius){
        super(color, texture);
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * (radius * radius);
    }

}