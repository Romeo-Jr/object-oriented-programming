package Inheritance.packages;

public class Shape{
    String color;
    String texture;

    public Shape(String color, String texture){
        this.color = color;
        this.texture = texture;
    }

    public String getColor(){
        return color;
    }

    public String getTextture(){
        return texture;
    }

}